package africa.semicolon.regcrow.dtos.response;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.mapper.Mapper;

@Getter
@Setter
public class TransactionInitiationResponse {

    public Long id;

    public String message;

    Mapper mapper;




}
