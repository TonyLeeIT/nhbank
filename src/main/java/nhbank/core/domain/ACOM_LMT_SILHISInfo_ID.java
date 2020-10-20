package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_LMT_SILHISInfo_ID implements Serializable {
    private String silCcy;
    private BigDecimal hisNo;
    private String sngNo;
    private String actCd;
} 
