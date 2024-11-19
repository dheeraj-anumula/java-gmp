package com.enterpise.app.dto;

import java.time.LocalDate;

public class Subscription {
    String bankcardNumber;

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getBankcardNumber() {
        return bankcardNumber;
    }

    LocalDate startDate;

    public Subscription(String bankcardNumber, LocalDate startDate) {
        this.bankcardNumber = bankcardNumber;
        this.startDate = startDate;
    }
}
