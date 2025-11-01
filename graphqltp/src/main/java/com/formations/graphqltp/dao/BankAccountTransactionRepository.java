package com.formations.graphqltp.dao;

import com.formations.graphqltp.model.BankAccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface BankAccountTransactionRepository extends
        JpaRepository<BankAccountTransaction, Long> {
    List<BankAccountTransaction> findByBankAccount_RibAndCreatedAtBetween(String rib, Date from, Date to);
}
