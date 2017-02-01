package classes.events;

public class AlarmEvent {
    private String text;

    public AlarmEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public AlarmEvent setText(String text) {
        this.text = text;
        return this;
    }
}

