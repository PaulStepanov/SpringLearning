package vkstuff.logic.converters;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import vkstuff.domain.Subscription;
import vkstuff.domain.biulders.SubscriptionBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Перевод из Plain JSON(ResponseEntity) в POJO для Subscription
 */
@Component
public class SubscriptionConverter {
    public ArrayList<Subscription> convertSubscriptions(ResponseEntity<String> entity) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(entity.getBody());
        ArrayNode arrayNode = (ArrayNode) root.get("response");
        ArrayList<Subscription> subscriptions = new ArrayList<Subscription>();
        if (arrayNode.isArray()) {
            for (JsonNode node : arrayNode) {
                subscriptions.add(
                        SubscriptionBuilder.aSubscription()
                                .withId(node.path("gid").asText())
                                .withName(node.path("name").asText())
                                .withPhoto(node.path("photo_big").asText())
                                .withScreen_name(node.path("screen_name").asText())
                                .build());
            }
        }
        return subscriptions;
    }
}
