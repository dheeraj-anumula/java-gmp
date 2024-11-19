package com.enterpise.app.bankapi;

import com.enterpise.app.dto.BankCard;
import com.enterpise.app.dto.BankCardType;
import com.enterpise.app.dto.User;

public interface Bank {
    BankCard createBankCard(User user, BankCardType bankCardType);
}
