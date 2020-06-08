package com.github.fabriciolfj.avroexample.domain.service;

import com.github.fabriciolfj.avroexample.api.dto.CustomerDTO;
import com.github.fabriciolfj.avroexample.api.mapper.CustomerMapper;
import com.github.fabriciolfj.avroexample.domain.integration.producer.ProducerCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final ProducerCustomer producer;
    private final CustomerMapper mapper;

    public void send(final CustomerDTO customerDTO) {
        var customer = mapper.toDomain(customerDTO);
        producer.produceCustomerDetails(customer);
    }
}
