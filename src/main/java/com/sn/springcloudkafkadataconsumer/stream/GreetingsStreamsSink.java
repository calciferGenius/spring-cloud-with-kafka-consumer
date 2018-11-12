package com.sn.springcloudkafkadataconsumer.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStreamsSink {

    String INPUT = "greetings-in";

    @Input(INPUT)
    SubscribableChannel inboundGreetings();

}
