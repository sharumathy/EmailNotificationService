package com.example.EmailNotifyService.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.EmailNotifyService.config.KafkaConfig;
import com.example.EmailNotifyService.dto.EmailRequest;

@Service
public class EmailProducer {
private final KafkaTemplate<String, EmailRequest> kafkaTemplate;
private final KafkaConfig kafkaConfig;

    public EmailProducer(KafkaTemplate<String, EmailRequest> kafkaTemplate, KafkaConfig kafkaConfig) {
        this.kafkaTemplate = kafkaTemplate;
        this.kafkaConfig = kafkaConfig;
    }

    public void send(EmailRequest emailRequest) {
        kafkaTemplate.send(kafkaConfig.getEmail(), emailRequest);
    }
}
