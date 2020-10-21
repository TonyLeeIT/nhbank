package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPH_SHIP_RESENDInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal bhSeq;
    private BigDecimal seq;
} 
