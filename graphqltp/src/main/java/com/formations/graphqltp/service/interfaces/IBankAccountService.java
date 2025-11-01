package com.formations.graphqltp.service.interfaces;

import com.formations.graphqltp.dtos.bankaccount.AddBankAccountRequest;
import com.formations.graphqltp.dtos.bankaccount.AddBankAccountResponse;
import com.formations.graphqltp.dtos.bankaccount.BankAccountDto;
import java.util.List;

public interface IBankAccountService {
    AddBankAccountResponse saveBankAccount(AddBankAccountRequest dto);
    List<BankAccountDto> getAllBankAccounts();
    BankAccountDto getBankAccountByRib(String rib);
}
