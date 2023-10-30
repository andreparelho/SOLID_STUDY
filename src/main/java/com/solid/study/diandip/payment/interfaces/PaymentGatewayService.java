package com.solid.study.diandip.payment.interfaces;

import java.math.BigDecimal;

public interface PaymentGatewayService {
    void processPayment(String cardNumber, BigDecimal amount);
}
