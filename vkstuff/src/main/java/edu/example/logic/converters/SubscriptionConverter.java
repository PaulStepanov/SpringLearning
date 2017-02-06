package edu.example.logic.converters;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.example.domain.Subscription;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Перевод из Plain JSON(ResponseEntity) в POJO для Subscription
 * */
@Component
public class SubscriptionConverter {
    public Subscription convertSubscriptions(ResponseEntity<String> entity) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(entity.getBody());

    }
}
