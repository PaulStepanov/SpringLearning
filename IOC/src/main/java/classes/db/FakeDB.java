package classes.db;

public class FakeDB {
    private String url;
    private String user;
    private String password;

    public FakeDB(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public FakeDB setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUser() {
        return user;
    }

    public FakeDB setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FakeDB setPassword(String password) {
        this.password = password;
        return this;
    }
}
