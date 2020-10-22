package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_FAB_ITMInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal hisNo;
} 
