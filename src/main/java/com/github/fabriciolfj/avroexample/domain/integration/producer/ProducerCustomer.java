package com.github.fabriciolfj.avroexample.domain.integration.producer;

import com.github.fabriciolfj.avroexample.domain.schema.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProducerCustomer {

    private final Processor processor;

    public void produceCustomerDetails(final Customer customer) {
        var message = MessageBuilder.withPayload(customer).build();
        processor.output().send(message);
    }
}
