package com.mrgiovanotti.rabbitmq.dummy;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class DummyController {
    
    private final DummyService dummyService;
    
    @GetMapping("/send")
    public String sendMessage() {
        String message = "Message #" + ThreadLocalRandom.current().nextInt();
        dummyService.sendToRabbit(new Data(1L, message));
        return "Message: << " + message + " >>";
    }
    
}
