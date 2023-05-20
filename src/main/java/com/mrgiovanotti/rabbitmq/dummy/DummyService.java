package com.mrgiovanotti.rabbitmq.dummy;

import org.springframework.stereotype.Service;

import com.mrgiovanotti.rabbitmq.producer.Producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class DummyService {
    
    private final Producer producer;
    
    public void sendToRabbit(Data message) {
        log.info("Producer says:<< {} >> will be sent", message);
        producer.send(message);
    }
    
}
