package com.github.fabriciolfj.avroexample.api.mapper;

import com.github.fabriciolfj.avroexample.api.dto.CustomerDTO;
import com.github.fabriciolfj.avroexample.domain.schema.Customer;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
public abstract class CustomerMapperDecorator implements CustomerMapper {


    @Override
    public Customer toDomain(CustomerDTO dto) {
        var random = new Random();
        return Customer.newBuilder()
                .setFirstName(dto.getFirstName())
                .setLastName(dto.getLastName())
                .setId(random.nextLong())
                .build();
    }
}
