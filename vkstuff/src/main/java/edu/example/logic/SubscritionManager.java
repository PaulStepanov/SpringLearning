package edu.example.logic;

import edu.example.domain.Subscription;

import java.util.ArrayList;

public interface SubscritionManager {
    ArrayList<Subscription> getSubscritionsByID(String id, Integer count);
}
