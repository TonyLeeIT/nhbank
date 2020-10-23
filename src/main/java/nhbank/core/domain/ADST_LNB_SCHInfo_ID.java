package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ADST_LNB_SCHInfo_ID implements Serializable {
    private String refNo;
    private String schGb;
    private BigDecimal adjSeq;
    private BigDecimal schSeq;
} 
