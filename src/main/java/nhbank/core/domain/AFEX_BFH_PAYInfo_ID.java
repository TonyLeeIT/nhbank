package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_BFH_PAYInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal payCnt;
} 
