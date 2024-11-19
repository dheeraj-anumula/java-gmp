package com.enterpise.app.bankimpl;

import com.enterpise.app.bankapi.Bank;
import com.enterpise.app.dto.*;

public class InvestmentBank implements Bank {

    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        if (BankCardType.CREDIT.equals(bankCardType)) {
            return new CreditBankCard(String.valueOf(Math.random()), user);
        } else {
            return new DebitBankCard(String.valueOf(Math.random()), user);
        }
    }
}
