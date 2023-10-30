package com.solid.study.diandip.sell;

import com.solid.study.diandip.payment.interfaces.PaymentGatewayService;
import com.solid.study.diandip.sell.model.Sell;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SellService {
    private PaymentGatewayService paymentGatewayService;

    public SellService(PaymentGatewayService paymentGatewayService) {
        this.paymentGatewayService = paymentGatewayService;
    }

    public void registrySell(Sell sell, String cardNumber){
        BigDecimal totalAmount = sell.getUnitPrice().multiply(new BigDecimal(sell.getQuantity()));

        System.out.println("[Venda] Registrando venda do produto " + sell.getProduct() + " no valor" +
                " de R$" + totalAmount);

        this.paymentGatewayService.processPayment(cardNumber, totalAmount);
    }
}
