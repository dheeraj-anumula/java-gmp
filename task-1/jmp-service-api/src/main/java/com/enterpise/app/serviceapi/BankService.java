package com.enterpise.app.serviceapi;

import com.enterpise.app.dto.BankCard;
import com.enterpise.app.dto.Subscription;
import com.enterpise.app.dto.User;
import com.enterpise.app.serviceapi.utils.DateUtil;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface BankService {
    void subscribe(BankCard bankCard);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    List<User> getAllUsers();

    default double getAverageUsersAge() {
        var users = getAllUsers();
        return users.stream().mapToDouble(user -> DateUtil.getAge(user.getBirthday())).average().orElse(0);
    }

    static boolean isPayableUser(User user) {
        return DateUtil.getAge(user.getBirthday()) >= 18;
    }

    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition);
}
