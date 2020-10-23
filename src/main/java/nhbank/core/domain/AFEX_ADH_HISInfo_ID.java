package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_ADH_HISInfo_ID implements Serializable {
    private String advNo;
    private BigDecimal hisNo;
} 
