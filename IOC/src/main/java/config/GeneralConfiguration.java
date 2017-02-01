package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SimpleAppConfig.class,JDBCConfig.class,
        LoggerConfig.class,EventConfig.class})
public class GeneralConfiguration {
}
