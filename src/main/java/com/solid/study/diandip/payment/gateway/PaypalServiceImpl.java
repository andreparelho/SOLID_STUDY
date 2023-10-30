package com.solid.study.diandip.payment.gateway;

import com.solid.study.diandip.payment.interfaces.PaymentGatewayService;

import java.math.BigDecimal;

public class PaypalServiceImpl implements PaymentGatewayService {
    private String username;
    private String password;

    public PaypalServiceImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void processPayment(String cardNumber, BigDecimal amount) {
        System.out.println("[Paypal] Usuario: " + this.username);
        System.out.println("[Paypal] Cobrando " + amount + ",00 do cartão " + cardNumber);
    }
}
