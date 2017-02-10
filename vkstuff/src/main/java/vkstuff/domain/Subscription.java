package vkstuff.domain;

public class Subscription {
    private String id;
    private String name;
    private boolean is_closed;
    private boolean is_admin;
    private boolean is_member;
    private String photo;
    private String screen_name;

    public String getScreen_name() {
        return screen_name;
    }

    public Subscription setScreen_name(String screen_name) {
        this.screen_name = screen_name;
        return this;
    }

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

    public String getPhoto() {
        return photo;
    }

    public Subscription setPhoto(String photo) {
        this.photo = photo;
        return this;
    }
}
