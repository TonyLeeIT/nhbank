package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_RCH_VOSTROInfo_ID implements Serializable {
    private Date ibIl;
    private BigDecimal seqNo;
    private BigDecimal hisNo;
    private BigDecimal cdAmt;
} 
