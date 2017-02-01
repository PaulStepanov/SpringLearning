package classes.events;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AlarmNotifier {
    @Resource(name = "alarmListener")
    private AlarmListener listener;
}
