package com.example.EmailNotifyService.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.EmailNotifyService.config.KafkaConfig;
import com.example.EmailNotifyService.dto.EmailRequest;

@Service
public class EmailProducer {
private final KafkaTemplate<String, EmailRequest> kafkaTemplate;

    public EmailProducer(KafkaTemplate<String, EmailRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(EmailRequest emailRequest) {
        kafkaTemplate.send(KafkaConfig.TOPIC, emailRequest);
    }
}
