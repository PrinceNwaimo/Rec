package africa.semicolon.regcrow.dtos.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class TransactionInitiationRequest {
    private Long sellerId;
    private Long buyerId;
    private String description;

}
