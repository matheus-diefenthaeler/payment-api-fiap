package br.com.fiap.paymentapi.infrastructure.mapper.impl;

import br.com.fiap.paymentapi.domain.model.Account;
import br.com.fiap.paymentapi.infrastructure.dto.AccountRequest;
import br.com.fiap.paymentapi.infrastructure.mapper.AccountMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public Account requestToModel(AccountRequest request) {
        return new Account(
                request.getAgency(),
                request.getAccountNumber(),
                request.getAccountType(),
                request.getBankName(),
                request.getAccountOwner(),
                request.getBalance()
        );
    }
}
