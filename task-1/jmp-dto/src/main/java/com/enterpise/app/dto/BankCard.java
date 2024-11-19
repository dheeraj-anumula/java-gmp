package com.enterpise.app.dto;

public abstract class BankCard {
    String number;

    public User getUser() {
        return user;
    }

    User user;

    public String getNumber() {
        return number;
    }

    public BankCard(String number, User user) {
        this.number = number;
        this.user = user;
    }
}
