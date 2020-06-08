package com.github.fabriciolfj.avroexample.api.mapper;

import com.github.fabriciolfj.avroexample.api.dto.CustomerDTO;
import com.github.fabriciolfj.avroexample.domain.schema.Customer;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(CustomerMapperDecorator.class)
public interface CustomerMapper {

    Customer toDomain(final CustomerDTO dto);
}
