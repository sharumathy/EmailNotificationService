package com.example.EmailNotifyService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmailNotifyService.dto.EmailRequest;
import com.example.EmailNotifyService.producer.EmailProducer;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/notifications")
public class EmailController {

    private final EmailProducer producer;

    public EmailController(EmailProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/email")
    public ResponseEntity<String> send(@RequestBody @Valid EmailRequest request) {
        producer.send(request);
        return ResponseEntity.ok("Email sent to Kafka topic.");
    }
}
