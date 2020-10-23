package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AACT_TRX_PLInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal segSeq;
} 
