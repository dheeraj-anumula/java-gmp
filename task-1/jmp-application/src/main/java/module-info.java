import com.enterpise.app.bankapi.Bank;
import com.enterpise.app.serviceapi.BankService;

module jmp.application {
    requires jmp.service.api;
    requires jmp.dto;
    requires jmp.bank.api;
    uses BankService;
    uses Bank;
}