package com.formations.graphqltp.presentation;

import lombok.AllArgsConstructor;
import com.formations.graphqltp.common.CommonTools;
import com.formations.graphqltp.dtos.transaction.AddWirerTransferRequest;
import com.formations.graphqltp.dtos.transaction.AddWirerTransferResponse;
import com.formations.graphqltp.dtos.transaction.GetTransactionListRequest;
import com.formations.graphqltp.dtos.transaction.TransactionDto;
import com.formations.graphqltp.service.interfaces.ITransactionService;
import com.formations.graphqltp.service.exception.BusinessException;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.Date;
import java.util.List;
@Controller
@AllArgsConstructor
public class TransactionGraphqlController {
    private ITransactionService transactionService;
    private CommonTools commonTools;
    @MutationMapping
    public AddWirerTransferResponse addWirerTransfer(@Argument("dto") AddWirerTransferRequest dto) {
        return transactionService.wiredTransfer(dto);
    }
    @QueryMapping
    public List<TransactionDto> getTransactions(@Argument GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }
}
