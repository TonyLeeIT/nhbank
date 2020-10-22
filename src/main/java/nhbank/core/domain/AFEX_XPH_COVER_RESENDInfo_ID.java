package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_XPH_COVER_RESENDInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal bhSeq;
} 
