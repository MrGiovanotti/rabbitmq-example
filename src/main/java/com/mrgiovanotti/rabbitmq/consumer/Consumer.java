package com.mrgiovanotti.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.mrgiovanotti.rabbitmq.dummy.Data;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Consumer {
    
    @RabbitListener(queues = { "${mrgiovanotti.queue.name}" })
    public void receive(@Payload Data message) {
        log.info("Consumer says: << {} >> received", message);
        makeItSlow();
    }
    
    private void makeItSlow() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
    
}
