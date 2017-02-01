package classes.events;

import org.springframework.beans.factory.annotation.Autowired;

public class AlarmNotifier {
    @Autowired
    private AlarmListener listener;
}
