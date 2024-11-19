import com.enterpise.app.bankapi.Bank;
import com.enterpise.app.bankimpl.CentralBank;
import com.enterpise.app.bankimpl.InvestmentBank;
import com.enterpise.app.bankimpl.RetailBank;

module jmp.cloud.bank.impl {
    requires jmp.dto;
    requires jmp.bank.api;
    provides Bank with RetailBank, CentralBank, InvestmentBank;
}