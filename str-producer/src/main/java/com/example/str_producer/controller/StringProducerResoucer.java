package com.example.str_producer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.str_producer.service.StringProducerService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/producer")
public class StringProducerResoucer {
    private final StringProducerService producerService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        producerService.sendMesage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
       
}
