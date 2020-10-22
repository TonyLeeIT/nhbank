package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AACT_TRX_BALInfo_ID implements Serializable {
    private String refNo;
    private String balDvCd;
    private String dtlsBalDvCd;
    private String ifrsDvCd;
    private String atitCd;
    private String ccy;
    private Date apclStrDt;
    private Date apclEndDt;
} 
