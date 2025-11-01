package com.formations.graphqltp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<BankAccountTransaction> bankAccountTransactionList;


    public User(String username) {
        this.username = username;
    }

}
