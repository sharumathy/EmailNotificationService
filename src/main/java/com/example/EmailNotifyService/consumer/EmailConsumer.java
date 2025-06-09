package com.example.EmailNotifyService.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.EmailNotifyService.config.KafkaConfig;
import com.example.EmailNotifyService.dto.EmailRequest;
import jakarta.mail.MessagingException;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailConsumer {
private final JavaMailSender mailSender;

    public EmailConsumer(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @KafkaListener(topics = KafkaConfig.TOPIC, groupId = "email-group")
    public void consume(EmailRequest request) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(request.getTo());
        helper.setSubject(request.getSubject());
        helper.setText(request.getBody(), request.isHtml());
        mailSender.send(message);
    }
}
