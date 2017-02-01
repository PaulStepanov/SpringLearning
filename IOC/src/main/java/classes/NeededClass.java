package classes;

public class NeededClass {
    private String text;

    public NeededClass(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public NeededClass setText(String text) {
        this.text = text;
        return this;
    }
}
