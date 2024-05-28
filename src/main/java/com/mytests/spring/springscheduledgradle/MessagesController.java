package com.mytests.spring.springscheduledgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MessagesController {

    private final MessagesRepository messagesRepository;

    public MessagesController(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @GetMapping("/all")
    public List<Messages> all() {
        List<Messages> messagesList = (List<Messages>) messagesRepository.findAll();
        System.out.println(messagesList.size());
        return messagesList;

    }


}
