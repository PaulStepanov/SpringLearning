package edu.example.confings;

import edu.example.logic.SubscritionManager;
import edu.example.logic.converters.SubscriptionConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SubscriptionConfig {

    @Bean
    @Scope("singleton")
    public SubscriptionConverter subscriptionConverter(){
        return new SubscriptionConverter();
    }

    @Bean
    @Scope("singleton")
    public SubscritionManager subscriptionBuilder(){
        return new SubscritionManager();
    }
}
