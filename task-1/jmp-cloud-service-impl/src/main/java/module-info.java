import com.enterpise.app.serviceapi.BankService;
import com.enterpise.app.serviceimpl.MemoryBankService;

module jmp.cloud.service.impl {
    requires jmp.service.api;
    requires jmp.dto;
    provides BankService with MemoryBankService;
}