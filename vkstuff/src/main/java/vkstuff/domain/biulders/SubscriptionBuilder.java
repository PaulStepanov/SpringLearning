package vkstuff.domain.biulders;

import vkstuff.domain.Subscription;

public final class SubscriptionBuilder {
    private String id;
    private String name;
    private boolean is_closed;
    private boolean is_admin;
    private boolean is_member;
    private String photo;
    private String screen_name;

    private SubscriptionBuilder() {
    }

    public static SubscriptionBuilder aSubscription() {
        return new SubscriptionBuilder();
    }

    public SubscriptionBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public SubscriptionBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SubscriptionBuilder withIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
        return this;
    }

    public SubscriptionBuilder withIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
        return this;
    }

    public SubscriptionBuilder withIs_member(boolean is_member) {
        this.is_member = is_member;
        return this;
    }

    public SubscriptionBuilder withPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public SubscriptionBuilder withScreen_name(String screen_name) {
        this.screen_name = screen_name;
        return this;
    }

    public Subscription build() {
        Subscription subscription = new Subscription();
        subscription.setId(id);
        subscription.setName(name);
        subscription.setIs_closed(is_closed);
        subscription.setIs_admin(is_admin);
        subscription.setIs_member(is_member);
        subscription.setPhoto(photo);
        subscription.setScreen_name(screen_name);
        return subscription;
    }
}
