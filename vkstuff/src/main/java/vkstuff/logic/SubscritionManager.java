package vkstuff.logic;

import vkstuff.domain.Subscription;

import java.util.ArrayList;

public interface SubscritionManager {
    ArrayList<Subscription> getSubscritionsByID(String id, Integer count);
}
