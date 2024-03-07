package br.com.fiap.paymentapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime date = LocalDateTime.now();
    private BigDecimal totalAmmount;
    private String originAccount;
    private String targetAccount;
    private String targetAccountName;
    private String status = "False";

    public Transaction(BigDecimal totalAmmount, String originAccount,
                       String targetAccount){
        setTotalAmmount(totalAmmount);
        setOriginAccount(originAccount);
        setTargetAccount(targetAccount);
    }
}
