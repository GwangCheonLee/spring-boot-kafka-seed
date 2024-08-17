package com.example.kafkaseed.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "example.user.registration";

    private final KafkaTemplate<String, Map<String, Object>> kafkaTemplate;

    KafkaProducerService(KafkaTemplate<String, Map<String, Object>> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Map<String, Object> message) {
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Sent message: " + message);
    }
}
