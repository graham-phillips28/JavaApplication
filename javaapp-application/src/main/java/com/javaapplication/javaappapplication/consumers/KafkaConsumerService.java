package com.javaapplication.javaappapplication.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test_topic", groupId = "myGroup")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}