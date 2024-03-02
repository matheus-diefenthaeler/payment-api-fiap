package br.com.fiap.paymentapi.adapter.in.controller;

import br.com.fiap.paymentapi.domain.service.AccountService;
import br.com.fiap.paymentapi.infrastructure.dto.AccountDeppositRequest;
import br.com.fiap.paymentapi.infrastructure.dto.AccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/accounts")
public class AccountController {

    private final AccountService service;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody AccountRequest request){

        ResponseEntity<?> responseEntity = service.create(request);
        return ResponseEntity.ok().body(responseEntity);
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<?> findByAccount(@PathVariable String accountNumber){
        ResponseEntity<?> byAccount = service.findByAccount(accountNumber);
        return ResponseEntity.ok().body(byAccount);

    }

    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@RequestBody AccountDeppositRequest request){
        service.deposit(request);
        return ResponseEntity.ok().build();
    }
}
