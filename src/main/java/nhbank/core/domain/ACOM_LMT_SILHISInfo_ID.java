package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_LMT_SILHISInfo_ID implements Serializable {
    private String sngNo;
    private String actCd;
    private String silCcy;
    private BigDecimal hisNo;
} 
