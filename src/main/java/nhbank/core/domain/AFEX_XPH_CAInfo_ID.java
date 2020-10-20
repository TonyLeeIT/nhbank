package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPH_CAInfo_ID implements Serializable {
    private BigDecimal seqNo;
    private Date rcvIl;
} 
