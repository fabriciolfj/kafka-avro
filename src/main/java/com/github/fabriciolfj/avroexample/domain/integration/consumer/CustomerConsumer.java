package com.github.fabriciolfj.avroexample.domain.integration.consumer;

import com.github.fabriciolfj.avroexample.domain.schema.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerConsumer {

    @StreamListener(Processor.INPUT)
    public void consumerCustomerDetails(final Customer customer) {
        log.info("Customer details: {}", customer);
    }
}
