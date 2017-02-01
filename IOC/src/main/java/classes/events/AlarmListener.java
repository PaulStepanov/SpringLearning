package classes.events;


import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

public class AlarmListener {
    private String text;

    @Autowired
    private Log log;


    @EventListener
    //@Async
    @Order(1)
    public void checkEvent(AlarmEvent event){
        log.warn(event.getText());
    }
}
