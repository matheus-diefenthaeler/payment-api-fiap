package br.com.fiap.paymentapi.domain.service;

import br.com.fiap.paymentapi.adapter.out.mysql.repository.AccountRepository;
import br.com.fiap.paymentapi.domain.model.Account;
import br.com.fiap.paymentapi.infrastructure.dto.PaymentRequest;
import br.com.fiap.paymentapi.port.in.PaymentInput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService implements PaymentInput {

    private final AccountRepository repository;
    private final AccountService accountService;

    @Override
    public ResponseEntity<?> toPay(PaymentRequest request) {

        Account originAcc = accountService.findByAccountAndAgency(request.getOriginAccountNumber(), request.getOriginAccountAgency());
        Account targetAcc = accountService.findByAccountAndAgency(request.getTargetAccountNumber(), request.getTargetAccountAgency());




        return null;
    }
}
