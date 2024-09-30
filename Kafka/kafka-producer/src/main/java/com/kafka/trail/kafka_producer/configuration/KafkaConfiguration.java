package com.kafka.trail.kafka_producer.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic createTopic(){
        return new NewTopic("topic_name",3, (short) 1);
    }
}
