package config;

import classes.events.AlarmEmitter;
import classes.events.AlarmListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EventConfig {

    @Bean(name = "AlarmEmitter")
    @Scope("singleton")
    public AlarmEmitter emitt(){
        return new AlarmEmitter();
    }

    @Bean(name = "AlarmListener")
    @Scope("prototype")
    public AlarmListener alarmListener(){
        return new AlarmListener();
    }
}
