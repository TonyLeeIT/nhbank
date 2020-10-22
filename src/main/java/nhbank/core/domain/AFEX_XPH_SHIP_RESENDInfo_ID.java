package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_XPH_SHIP_RESENDInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal bhSeq;
    private BigDecimal seq;
} 
