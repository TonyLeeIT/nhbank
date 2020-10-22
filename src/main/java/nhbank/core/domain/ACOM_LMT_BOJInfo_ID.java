package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_LMT_BOJInfo_ID implements Serializable {
    private String sngNo;
    private BigDecimal seq;
} 
