package br.com.fiap.paymentapi.domain.service;

import br.com.fiap.paymentapi.adapter.out.mysql.repository.AccountRepository;
import br.com.fiap.paymentapi.domain.model.Account;
import br.com.fiap.paymentapi.infrastructure.dto.AccountRequest;
import br.com.fiap.paymentapi.infrastructure.mapper.impl.AccountMapperImpl;
import br.com.fiap.paymentapi.port.in.AccountInput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService implements AccountInput {

    private final AccountRepository repository;
    private final AccountMapperImpl mapper;

    @Override
    public ResponseEntity<?> create(AccountRequest request) {
        Account account = mapper.requestToModel(request);
        return ResponseEntity.ok().body(repository.save(account));

    }

}
