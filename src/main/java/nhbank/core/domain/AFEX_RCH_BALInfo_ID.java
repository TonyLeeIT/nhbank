package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_RCH_BALInfo_ID implements Serializable {
    private String cd;
    private String ccy;
    private Date trIl;
} 
