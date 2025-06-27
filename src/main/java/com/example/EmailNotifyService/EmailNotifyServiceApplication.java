package com.example.EmailNotifyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.example.EmailNotifyService.config.KafkaConfig;

@SpringBootApplication
@EnableConfigurationProperties(KafkaConfig.class)
public class EmailNotifyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailNotifyServiceApplication.class, args);
	}

}
