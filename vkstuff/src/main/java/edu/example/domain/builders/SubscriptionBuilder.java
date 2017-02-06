package edu.example.domain.builders;

import edu.example.domain.Subscription;

public final class SubscriptionBuilder {
    private String id;
    private String name;
    private boolean is_closed;
    private boolean is_admin;
    private boolean is_member;
    private String photo;

    private SubscriptionBuilder() {
    }

    public static SubscriptionBuilder aSubscription() {
        return new SubscriptionBuilder();
    }

    public SubscriptionBuilder id(String id) {
        this.id = id;
        return this;
    }

    public SubscriptionBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SubscriptionBuilder is_closed(boolean is_closed) {
        this.is_closed = is_closed;
        return this;
    }

    public SubscriptionBuilder is_admin(boolean is_admin) {
        this.is_admin = is_admin;
        return this;
    }

    public SubscriptionBuilder is_member(boolean is_member) {
        this.is_member = is_member;
        return this;
    }

    public SubscriptionBuilder photo(String photo) {
        this.photo = photo;
        return this;
    }

    public SubscriptionBuilder but() {
        return aSubscription().id(id).name(name).is_closed(is_closed).is_admin(is_admin).is_member(is_member).photo(photo);
    }

    public Subscription build() {
        Subscription subscription = new Subscription();
        subscription.setId(id);
        subscription.setName(name);
        subscription.setIs_closed(is_closed);
        subscription.setIs_admin(is_admin);
        subscription.setIs_member(is_member);
        subscription.setPhoto(photo);
        return subscription;
    }
}
