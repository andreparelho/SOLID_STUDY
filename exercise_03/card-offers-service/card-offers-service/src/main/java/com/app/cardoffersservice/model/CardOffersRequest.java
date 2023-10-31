package com.app.cardoffersservice.model;

public class CardOffersRequest {
    private String cardNumber;
    private String cvv;
    private String cardUsername;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardUsername() {
        return cardUsername;
    }

    public void setCardUsername(String cardUsername) {
        this.cardUsername = cardUsername;
    }
}
