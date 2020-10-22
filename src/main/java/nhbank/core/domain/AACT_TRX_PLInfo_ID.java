package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AACT_TRX_PLInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal segSeq;
} 
