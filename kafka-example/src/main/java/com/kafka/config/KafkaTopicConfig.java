package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.admin.TopicDescription;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Controller;

@Controller
public class KafkaTopicConfig {

    @Bean
    public NewTopic leecodeTopic(){
        return TopicBuilder.name("leecode")
                .build();
    }
}
