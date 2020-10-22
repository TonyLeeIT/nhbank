package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_RCH_SEQNOInfo_ID implements Serializable {
    private Date trIl;
    private String saGb;
    private String cd;
    private String ccy;
} 
