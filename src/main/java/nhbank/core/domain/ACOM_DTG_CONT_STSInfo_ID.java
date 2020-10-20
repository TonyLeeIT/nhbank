package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DTG_CONT_STSInfo_ID implements Serializable {
    private BigDecimal seqNo;
    private String refNo;
    private String brNo;
} 
