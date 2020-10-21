package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_IPH_COVERInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal seq;
} 
