package com.study.payservice.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayService {
    private final TaxService taxService;
    private final DeliverService deliverService;

    public PayService(TaxService taxService, DeliverService deliverService) {
        this.taxService = taxService;
        this.deliverService = deliverService;
    }

    public double finalPrice(double cost, String state){



        return cost + this.deliverService.shippingAmount(state) + this.taxService.taxFee(cost);
    }
}
