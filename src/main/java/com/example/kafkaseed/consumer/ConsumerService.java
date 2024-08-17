package com.example.kafkaseed.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "example.user.registration", groupId = "example_user_registration_consumer_group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}
