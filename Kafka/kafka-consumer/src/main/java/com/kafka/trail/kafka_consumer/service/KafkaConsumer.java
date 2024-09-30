package com.kafka.trail.kafka_consumer.service;

import org.slf4j.Logger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "testing", groupId = "jt-group-1")
    public void consume(String message){
        logger.info("Consumer cosumed message {}",message);
    }

}
