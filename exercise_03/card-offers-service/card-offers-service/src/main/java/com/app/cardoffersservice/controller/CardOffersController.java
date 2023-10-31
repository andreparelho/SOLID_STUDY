package com.app.cardoffersservice.controller;

import com.app.cardoffersservice.builder.CardOffersRequestBuilder;
import com.app.cardoffersservice.model.CardOffersRequest;
import com.app.cardoffersservice.model.CardOffersResponse;
import com.app.cardoffersservice.validator.CardOffersValidator;

public class CardOffersController {
    private final CardOffersValidator cardOffersValidator;
    private final CardOffersRequestBuilder cardOffersRequestBuilder;

    public CardOffersController(CardOffersValidator cardOffersValidator, CardOffersRequestBuilder cardOffersRequestBuilder) {
        this.cardOffersValidator = cardOffersValidator;
        this.cardOffersRequestBuilder = cardOffersRequestBuilder;
    }

    public CardOffersResponse getOffers(CardOffersRequest request){



        return null;
    }
}
