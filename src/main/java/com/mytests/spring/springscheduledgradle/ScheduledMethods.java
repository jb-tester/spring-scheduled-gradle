package com.mytests.spring.springscheduledgradle;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Component
@Transactional
public class ScheduledMethods {

    private final MessagesRepository messagesRepository;

    public ScheduledMethods(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @Scheduled(cron = "0 */1 * * Apr *")
    public void method1() {
        System.out.println("+++++++++");
        System.out.println("method1 invoked");
        messagesRepository.save(new Messages("created by scheduled method1", new Timestamp(System.currentTimeMillis())));
        System.out.println("messages submitted: "+messagesRepository.count());
        System.out.println("+++++++++");
    }
    @Scheduled(cron = "0 */1 * * May *")
    public void method2() {
        System.out.println("+++++++++");
        System.out.println("method2 invoked");
        messagesRepository.save(new Messages("created by scheduled method2", new Timestamp(System.currentTimeMillis())));
        System.out.println("messages submitted: "+messagesRepository.count());
        System.out.println("+++++++++");
    }


}
