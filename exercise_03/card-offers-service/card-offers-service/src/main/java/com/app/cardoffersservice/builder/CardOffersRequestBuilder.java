package com.app.cardoffersservice.builder;

import com.app.cardoffersservice.model.CardOffersRequest;
import com.app.cardoffersservice.model.CardOffersServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class CardOffersRequestBuilder {
    private final CardOffersServiceRequest cardOffersServiceRequest;

    @Autowired
    public CardOffersRequestBuilder(CardOffersServiceRequest cardOffersServiceRequest) {
        this.cardOffersServiceRequest = cardOffersServiceRequest;
    }

    public CardOffersServiceRequest buildServiceRequest(CardOffersRequest request){
        this.cardOffersServiceRequest.setCardNumber(request.getCardNumber());
        this.cardOffersServiceRequest.setCvv(request.getCvv());
        this.cardOffersServiceRequest.setCardUsername(request.getCardUsername());

        return this.cardOffersServiceRequest;
    }
}
