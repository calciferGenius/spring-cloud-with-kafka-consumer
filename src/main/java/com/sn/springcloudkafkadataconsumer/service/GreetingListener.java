package com.sn.springcloudkafkadataconsumer.service;

import com.sn.springcloudkafkadataconsumer.model.Greetings;
import com.sn.springcloudkafkadataconsumer.stream.GreetingsStreamsSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * To consume data from channel
 */
@EnableBinding(GreetingsStreamsSink.class)
@Slf4j
public class GreetingListener {

    @StreamListener(GreetingsStreamsSink.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greetings: {}", greetings);
    }
}