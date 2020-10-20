package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_ADH_ITMInfo_ID implements Serializable {
    private BigDecimal hisNo;
    private String advNo;
} 
