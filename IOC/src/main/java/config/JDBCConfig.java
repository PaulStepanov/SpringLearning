package config;

import classes.db.FakeDB;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * PropertySource импортирует свойсва в Environment данного контекста
 *
 * The Environment is an abstraction integrated in the container that models two key aspects
 * of the application environment:
 * profiles and properties.
 * */

@Configuration
//@ImportResource("file:E:\\java\\spring tryes\\IOC\\src\\main\\java\\config\\db\\jdbc-conf.xml"))
@PropertySource("file:E:\\java\\spring tryes\\IOC\\src\\main\\java\\config\\db\\connection.properties")
public class JDBCConfig {
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;

    @Bean()
    public FakeDB fakeDB(){
        return new FakeDB(url,user,password);
    }
}
