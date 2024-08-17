package com.example.kafkaseed.producer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class KafkaProducerController {

    private final KafkaProducerService producerService;

    KafkaProducerController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody Map<String, Object> body) {
        producerService.sendMessage(body);
        return "Message sent to Kafka Topic";
    }
}
