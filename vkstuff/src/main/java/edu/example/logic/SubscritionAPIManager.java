package edu.example.logic;

import edu.example.logic.converters.SubscriptionConverter;
import edu.example.domain.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

@Component
public class SubscritionAPIManager implements SubscritionManager{
    private static final String getSubscriprionsAPIURI
            = "https://api.vk.com/method/users.getSubscriptions?user_id=%1$s&extended=1$&count=%2$d";
    @Autowired
    private SubscriptionConverter converter;

    public ArrayList<Subscription> getSubscritionsByID(String id,Integer count) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate
                    .getForEntity(String.format(getSubscriprionsAPIURI,id,count),String.class);
            return converter.convertSubscriptions(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
