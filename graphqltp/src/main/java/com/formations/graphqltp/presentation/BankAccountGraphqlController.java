package com.formations.graphqltp.presentation;

import lombok.AllArgsConstructor;
import com.formations.graphqltp.dtos.bankaccount.AddBankAccountRequest;
import com.formations.graphqltp.dtos.bankaccount.AddBankAccountResponse;
import com.formations.graphqltp.dtos.bankaccount.BankAccountDto;
import com.formations.graphqltp.service.interfaces.IBankAccountService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
@Controller
@AllArgsConstructor
public class BankAccountGraphqlController {
    private final IBankAccountService bankAccountService;
    @QueryMapping
    List<BankAccountDto> bankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }
    @QueryMapping
    BankAccountDto bankAccountByRib(@Argument String rib) {
        return bankAccountService.getBankAccountByRib(rib);
    }
    @MutationMapping
    public AddBankAccountResponse addBankAccount(@Argument("dto") AddBankAccountRequest dto) {
        return bankAccountService.saveBankAccount(dto);
    }
}
