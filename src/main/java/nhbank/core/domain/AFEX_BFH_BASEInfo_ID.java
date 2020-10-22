package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_BFH_BASEInfo_ID implements Serializable {
    private Date recvIl;
    private BigDecimal seqNo;
} 
