package com.formations.graphqltp.service.interfaces;

import com.formations.graphqltp.dtos.transaction.AddWirerTransferRequest;
import com.formations.graphqltp.dtos.transaction.AddWirerTransferResponse;
import com.formations.graphqltp.dtos.transaction.GetTransactionListRequest;
import com.formations.graphqltp.dtos.transaction.TransactionDto;

import java.util.List;

public interface ITransactionService {
    AddWirerTransferResponse wiredTransfer(AddWirerTransferRequest dto);
    List<TransactionDto> getTransactions(GetTransactionListRequest dto);
}

