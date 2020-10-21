package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_ADH_AMENDInfo_ID implements Serializable {
    private Date makeIl;
    private BigDecimal seqNo;
} 
