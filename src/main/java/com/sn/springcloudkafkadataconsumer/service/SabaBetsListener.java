package com.sn.springcloudkafkadataconsumer.service;

import com.sn.springcloudkafkadataconsumer.model.SabaBetData;
import com.sn.springcloudkafkadataconsumer.stream.SabaStreamsSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@EnableBinding(SabaStreamsSink.class)
@Slf4j
public class SabaBetsListener {

    @StreamListener(SabaStreamsSink.TEST_DATA_INPUT)
    public void handleGreetings(@Payload SabaBetData sabaBetData) {
        log.info("Received saba bet data: {}", sabaBetData);
    }
}
