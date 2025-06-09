package com.example.EmailNotifyService.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
public static final String TOPIC = "email-topic";

    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name(TOPIC).partitions(1).replicas(1).build();
    }
}
