package com.mytests.spring.springscheduledgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringScheduledGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScheduledGradleApplication.class, args);
    }

}
