package config;

import classes.ClassWrapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


/**
 * Подозреваю что так делать не желательно т.к. при добавлении Bean'а класса ClassWrapper он его свяжент
 * */
@Configuration
public class LoggerConfig {

    //Сам логер
    @Bean()
    @Scope("prototype")

    public Log log(ClassWrapper classWrapper){
        return LogFactory.getLog(classWrapper.getaClass());
    }
    //Для того что б логер логировал от имени обьекта Object в случае когда автосвязывание не нашло ничего нужного
    // пока не придумал как седлать нормально
    @Bean
    @Scope("prototype")
    public Log log(){
        return LogFactory.getLog(Object.class);
    }
}
