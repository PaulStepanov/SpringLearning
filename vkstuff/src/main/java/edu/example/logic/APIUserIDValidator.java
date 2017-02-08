package edu.example.logic;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * from url https://vk.com/user or https://vk.com/id82601175 return id(user,82601175),
 * return null if user wasn't found
 */
public class APIUserIDValidator implements UserIDValidator {

    private final String userPattern = "(?:https?:\\/\\/)?(?:www\\.)?vk\\.com\\/(.*)\\/?";
    private final String getUserAPIURI = "https://api.vk.com/method/users.get?user_ids=%1$s";

    /*Cut user_id or screen_name from url and
    if it mathced user_id, than remove "id" in the beelining*/
    private String splitID(String input) {
        Pattern pattern = Pattern.compile(userPattern);
        Matcher matcher = pattern.matcher(input);
        String userID = null;
        if (matcher.find()) {
            userID = matcher.group(1);
        }
        if (userID == null)
            return null;
        pattern = Pattern.compile("[<>%\\/$?&]");
        matcher = pattern.matcher(userID);
        if (matcher.find()) {
            return null;
        }
        pattern = Pattern.compile("^(id)");
        matcher = pattern.matcher(userID);
        if (matcher.find()) {
            return userID.substring(2);
        } else {
            return userID;
        }
    }

    @Override
    public String validateID(String input) {
        String userID = splitID(input);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate
                .getForEntity(String.format(getUserAPIURI, userID), String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode root = mapper.readTree(response.getBody());
            ArrayNode arrayNode = (ArrayNode) root.get("response");
            if (arrayNode.isArray()) {
                JsonNode node = arrayNode.get(0);
                return node.findValue("uid").asText();
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
