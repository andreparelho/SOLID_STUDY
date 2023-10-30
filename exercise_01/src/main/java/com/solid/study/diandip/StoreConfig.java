package com.solid.study.diandip;

import com.solid.study.diandip.payment.gateway.PagSeguroServiceImpl;
import com.solid.study.diandip.payment.gateway.PaypalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class StoreConfig {

    @Bean
    public PaypalServiceImpl paypalService() {
        return new PaypalServiceImpl("andre_parelho", "12345678");
    }

    @Primary
    @Bean
    public PagSeguroServiceImpl pagSeguroService() {
        return new PagSeguroServiceImpl("762def23921382o219321d");
    }
}
