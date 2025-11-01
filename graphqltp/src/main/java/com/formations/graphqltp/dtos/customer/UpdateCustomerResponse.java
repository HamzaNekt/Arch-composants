package com.formations.graphqltp.dtos.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UpdateCustomerResponse {
    private Long id;
    private String message;
    private String username;
    private String identityRef;
    private String firstName;
    private String lastName;

}