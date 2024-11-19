package com.enterpise.app.serviceimpl;

import com.enterpise.app.dto.BankCard;
import com.enterpise.app.dto.Subscription;
import com.enterpise.app.dto.User;
import com.enterpise.app.serviceapi.BankService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MemoryBankService implements BankService {

    List<Subscription> subscriptions = new ArrayList<>();
    List<User> users = new ArrayList<>();

    @Override
    public void subscribe(BankCard bankCard) {
        if (bankCard != null) {
            subscriptions.add(new Subscription(bankCard.getNumber(), LocalDate.now()));
            users.add(bankCard.getUser());
        }
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
        return subscriptions.stream().filter((subscription -> subscription.getBankcardNumber().equals(cardNumber))).findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition) {
        return subscriptions.stream().filter(condition).toList();
    }
}
