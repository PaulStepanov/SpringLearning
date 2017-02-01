package config;

import classes.NeededClass;
import classes.SomeClass;
import classes.events.AlarmNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

/**
 * 1.By default, configuration classes use a @Bean method’s name as the name of the resulting bean.
 *This functionality can be overridden, however, with the name attribute
 *
 *2.As discussed in Section 7.3.1, “Naming beans”,
 * it is sometimes desirable to give a single bean multiple names, otherwise known as bean aliasing.
 * The name attribute of the @Bean annotation accepts a String array for this purpose.
 * */
@Profile("dev")//doc.7.13
@Configuration
public class SimpleAppConfig {

    @Bean(name = "ndCl")//1
    @Scope("singleton")
    public NeededClass neededClass(){
        return new NeededClass("Text");
    }

    @Bean(initMethod = "init",name = {"someClass","someClass1","someClass2"})//2,в фигурных скобках просто массив строк
    @Scope("prototype")
    public SomeClass someClass(NeededClass neededClass) {//Нахождение класса осуществляется при помощи AutoWire(doc.7.4.5)
        return new SomeClass(neededClass);
    }
}
