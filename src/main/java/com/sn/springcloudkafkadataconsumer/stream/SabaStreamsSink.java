package com.sn.springcloudkafkadataconsumer.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SabaStreamsSink {

    String TEST_DATA_INPUT = "test-data-input";

    @Input(TEST_DATA_INPUT)
    SubscribableChannel inboundTestData();

}
