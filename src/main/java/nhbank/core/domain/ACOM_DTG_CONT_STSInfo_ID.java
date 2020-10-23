package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_DTG_CONT_STSInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal seqNo;
    private String brNo;
} 
