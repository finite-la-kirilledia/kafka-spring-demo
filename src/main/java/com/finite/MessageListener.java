package com.finite;

import com.finite.config.KafkaTopicConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = KafkaTopicConfig.TOPIC, groupId = "bar")
    public void messageListener(String message) {
        System.out.println("Received message: " + message);
    }
}
