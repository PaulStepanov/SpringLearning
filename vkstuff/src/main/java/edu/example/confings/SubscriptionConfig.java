package edu.example.confings;

import edu.example.logic.APISubscritionManager;
import edu.example.logic.APIUserIDValidator;
import edu.example.logic.SubscritionManager;
import edu.example.logic.UserIDValidator;
import edu.example.logic.converters.SubscriptionConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
    @Primary
    @Scope("singleton")
    public SubscritionManager subscriptionManager(){
        return new APISubscritionManager();
    }

    @Bean
    @Scope("singleton")
    public UserIDValidator userIDValidator(){
        return new APIUserIDValidator();
    }

}
