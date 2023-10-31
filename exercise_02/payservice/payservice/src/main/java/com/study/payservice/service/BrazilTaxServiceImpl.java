package com.study.payservice.service;

import org.springframework.stereotype.Component;

@Component
public class BrazilTaxServiceImpl implements TaxService {
    @Override
    public double taxFee(Double amount) {
        return amount * 0.1;
    }
}
