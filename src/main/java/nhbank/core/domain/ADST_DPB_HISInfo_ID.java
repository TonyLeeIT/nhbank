package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ADST_DPB_HISInfo_ID implements Serializable {
    private String acctNo;
    private BigDecimal hisNo;
} 
