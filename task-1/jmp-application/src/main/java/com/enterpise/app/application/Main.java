package com.enterpise.app.application;

import com.enterpise.app.bankapi.Bank;
import com.enterpise.app.dto.BankCard;
import com.enterpise.app.dto.BankCardType;
import com.enterpise.app.dto.User;
import com.enterpise.app.serviceapi.BankService;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Bank> banks = ServiceLoader.load(Bank.class);
        Optional<ServiceLoader.Provider<Bank>> optionalBank = banks.stream().findFirst();

        if (optionalBank.isPresent()) {
            Bank bank = optionalBank.get().get();
            User user = new User("Dheeraj", "Anumula", LocalDate.of(1998, Month.SEPTEMBER, 8));
            BankCard creditCard = bank.createBankCard(user, BankCardType.CREDIT);

            ServiceLoader<BankService> bankServices = ServiceLoader.load(BankService.class);
            Optional<ServiceLoader.Provider<BankService>> optionalBankServiceProvider = bankServices.stream().findFirst();

            if (optionalBankServiceProvider.isPresent()) {
                BankService bankService = optionalBankServiceProvider.get().get();
                bankService.subscribe(creditCard);

                System.out.println("getAllUsers():: " + bankService.getAllUsers());
                System.out.println("isPayableUser(User):: " + BankService.isPayableUser(user));
                System.out.println("getAverageUsersAge():: " + bankService.getAverageUsersAge());
            }

        }
    }
}
