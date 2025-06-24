package com.example.str_consumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
    
    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strConteinerFactory")
    public void listeners (String message) {
        log.info("receiver {}",message);
    }
}
