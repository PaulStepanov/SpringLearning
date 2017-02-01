package com.example;

import classes.ClassWrapper;
import classes.SomeClass;
import classes.db.FakeDB;
import classes.events.AlarmEmitter;
import classes.events.AlarmListener;
import classes.events.AlarmNotifier;
import config.GeneralConfiguration;
import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev","test");
        context.register(GeneralConfiguration.class);
        context.refresh();

        Log log = (Log) context.getBean("log", new ClassWrapper(IocApplication.class));
        log.warn(context.getEnvironment().containsProperty("url"));
        SomeClass someClass= (SomeClass) context.getBean("someClass1");
        FakeDB config= (FakeDB) context.getBean("fakeDB");
        log.warn(config.getUrl());

        //Events
        AlarmNotifier alarmNotifier= new AlarmNotifier();
        AlarmListener listener= (AlarmListener) context.getBean("AlarmListener");
        AlarmEmitter emitter = (AlarmEmitter) context.getBean("AlarmEmitter");
        emitter.emitt();
	}
}
