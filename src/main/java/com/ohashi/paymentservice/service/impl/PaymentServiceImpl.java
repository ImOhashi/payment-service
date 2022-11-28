package com.ohashi.paymentservice.service.impl;

import com.ohashi.paymentservice.model.Payment;
import com.ohashi.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Log4j2
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @Override
    public void sendPayment(Payment payment) {
        log.info("Received payment: {}", payment);
        kafkaTemplate.send("payment-topic", payment);
    }
}
