package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DTG_NAPAS_HISInfo_ID implements Serializable {
    private String de032AcqCd;
    private BigDecimal hisNo;
    private String de041CrdAcptTrm;
    private String de011TraceNo;
    private String trnDate;
} 
