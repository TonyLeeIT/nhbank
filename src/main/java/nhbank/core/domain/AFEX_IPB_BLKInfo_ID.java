package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_IPB_BLKInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal sseq;
    private BigDecimal seq;
} 
