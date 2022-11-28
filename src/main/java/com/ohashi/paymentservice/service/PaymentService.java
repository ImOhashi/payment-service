package com.ohashi.paymentservice.service;

import com.ohashi.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
