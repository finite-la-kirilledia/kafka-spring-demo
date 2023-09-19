package com.finite.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public static final String TOPIC = "messages";

    @Bean
    public NewTopic messagesTopic() {
        return TopicBuilder.name(TOPIC).build();
    }
}
