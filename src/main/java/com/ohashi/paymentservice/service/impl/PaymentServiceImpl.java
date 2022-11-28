package com.ohashi.paymentservice.service.impl;

import com.ohashi.paymentservice.model.Payment;
import com.ohashi.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("Received payment: {}", payment);
    }
}
