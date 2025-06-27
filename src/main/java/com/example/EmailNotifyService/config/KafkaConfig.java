package com.example.EmailNotifyService.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@ConfigurationProperties(prefix = "kafka.topic")
public class KafkaConfig {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name(email).partitions(1).replicas(1).build();
    }
}
