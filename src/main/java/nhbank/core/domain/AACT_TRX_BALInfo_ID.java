package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AACT_TRX_BALInfo_ID implements Serializable {
    private String balDvCd;
    private String refNo;
    private String ccy;
    private String atitCd;
    private Date apclStrDt;
    private Date apclEndDt;
    private String dtlsBalDvCd;
    private String ifrsDvCd;
} 
