package com.example.str_producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMesage(String message) {
          kafkaTemplate.send("str-topic", message)
          .whenComplete((result,ex) ->{
           if (ex != null) {
            System.err.println("Erro ao enviar mensagem: " + ex.getMessage());
        } else {
            System.out.println("Mensagem enviada com sucesso!");
        }
          });
    }
}
