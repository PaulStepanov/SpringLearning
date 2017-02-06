package edu.example.logic.converters;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import edu.example.domain.Subscription;
import edu.example.domain.builders.SubscriptionBuilder;
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
                                .id(node.path("gid").asText())
                                .name(node.path("name").asText())
                                .photo(node.path("photo").asText())
                                .build());
            }
        }
        return subscriptions;
    }
}
