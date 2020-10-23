package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_IPH_ATAGInfo_ID implements Serializable {
    private String refNo;
    private String amdSeq;
    private String tagCd;
    private BigDecimal seq;
} 
