package aegis.banktransactiontrackpoc.service;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder
@Getter
@ToString
public class Transaction {
    private LocalDateTime time;
    private String name;
    private TransactionType type;
    private Long amount;
    private Long balance;
}
