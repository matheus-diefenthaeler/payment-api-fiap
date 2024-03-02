package br.com.fiap.paymentapi.port.in;

import br.com.fiap.paymentapi.infrastructure.dto.PaymentRequest;
import org.springframework.http.ResponseEntity;

public interface PaymentInput {

    ResponseEntity<?> toPay(PaymentRequest request);
}
