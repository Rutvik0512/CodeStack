package com.kafka.trail.kafka_producer.controller;

import com.kafka.trail.kafka_producer.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    public KafkaMessagePublisher kafkaMessagePublisher;

    @PutMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message){
        try{
            for(int i=0; i<10000; i++){
                kafkaMessagePublisher.sendMessageToTopic(message);
            }
            return ResponseEntity.ok("Message sent");
        }catch (Exception e){
            return  ResponseEntity.internalServerError().build();
        }
    }
}
