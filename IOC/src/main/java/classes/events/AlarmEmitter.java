package classes.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class AlarmEmitter {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void emitt(){
        publisher.publishEvent(new AlarmEvent("text"));
    }
}
