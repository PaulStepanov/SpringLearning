package edu.example.domain;

public class Subscription {
    private String id;
    private String name;
    private boolean is_closed;
    private boolean is_admin;
    private boolean is_member;
    private String photo_200;

    public String getId() {
        return id;
    }

    public Subscription setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Subscription setName(String name) {
        this.name = name;
        return this;
    }

    public boolean is_closed() {
        return is_closed;
    }

    public Subscription setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
        return this;
    }

    public boolean is_admin() {
        return is_admin;
    }

    public Subscription setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
        return this;
    }

    public boolean is_member() {
        return is_member;
    }

    public Subscription setIs_member(boolean is_member) {
        this.is_member = is_member;
        return this;
    }

    public String getPhoto_200() {
        return photo_200;
    }

    public Subscription setPhoto_200(String photo_200) {
        this.photo_200 = photo_200;
        return this;
    }
}
