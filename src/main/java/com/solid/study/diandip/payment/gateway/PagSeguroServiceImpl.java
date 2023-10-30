package com.solid.study.diandip.payment.gateway;

import com.solid.study.diandip.payment.interfaces.PaymentGatewayService;

import java.math.BigDecimal;

public class PagSeguroServiceImpl implements PaymentGatewayService {
    private String token;

    public PagSeguroServiceImpl(String token) {
        this.token = token;
    }

    @Override
    public void processPayment(String cardNumber, BigDecimal amount) {
        System.out.println("[PagSeguro] Usando token: " + this.token);
        System.out.println("[PagSeguro] Cobrando R$" + amount + ",00 do cartão " + cardNumber);
    }
}
