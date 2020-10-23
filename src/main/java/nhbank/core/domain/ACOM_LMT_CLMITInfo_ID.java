package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_LMT_CLMITInfo_ID implements Serializable {
    private String laInspRcno;
    private BigDecimal chgSqno;
} 
