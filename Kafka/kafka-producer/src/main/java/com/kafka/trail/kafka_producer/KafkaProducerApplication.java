package com.kafka.trail.kafka_producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);

	}

}
