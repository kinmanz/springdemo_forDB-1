package com.db.quoters;

import com.db.magic.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Evegeny on 30/08/2017.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuoterConfig.class);
        try {
            context.getBean(TalkingRobot.class).talk();
        } catch (DBRuntimeException e) {
            System.out.println("была проблема, но мы её решили...");
        }
        try {
            context.getBean(TalkingRobot.class).talk();
        } catch (DBRuntimeException e) {
            System.out.println("была проблема, но мы её решили...");
        }

    }
}
