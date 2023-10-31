package com.study.payservice.service;

import org.springframework.stereotype.Component;

@Component
public class BrazilDeliverServiceImpl implements DeliverService {
    @Override
    public double shippingAmount(String state) {
        if ("SP".equalsIgnoreCase(state)){
            return 10.0;
        }
        return 20.0;
    }
}
