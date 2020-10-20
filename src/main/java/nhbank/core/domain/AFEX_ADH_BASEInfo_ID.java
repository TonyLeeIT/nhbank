package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_ADH_BASEInfo_ID implements Serializable {
    private BigDecimal seqNo;
    private Date makeIl;
} 
