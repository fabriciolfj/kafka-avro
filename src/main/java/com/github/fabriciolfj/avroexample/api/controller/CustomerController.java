package com.github.fabriciolfj.avroexample.api.controller;

import com.github.fabriciolfj.avroexample.api.dto.CustomerDTO;
import com.github.fabriciolfj.avroexample.domain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    public void create(@RequestBody CustomerDTO dto) {
        service.send(dto);
    }
}
