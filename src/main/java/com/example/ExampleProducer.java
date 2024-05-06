package com.example;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface ExampleProducer {

    @Topic("example")
    void publishSentence(String sentence);
}
