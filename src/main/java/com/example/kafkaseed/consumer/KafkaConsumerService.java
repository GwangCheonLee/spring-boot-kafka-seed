package com.example.kafkaseed.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "example.user.registration",
            groupId = "example_user_registration_consumer_group",
            containerFactory = "kafkaListenerContainerFactory")
    public void consume(Map<String, Object> message) {
        System.out.println("Received message: " + message);
    }
}
