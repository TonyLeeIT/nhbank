package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DTG_NAPAS_RECONInfo_ID implements Serializable {
    private String bkCd;
    private String reconType;
    private String de032AcqCd;
    private String de041CrdAcptTrm;
    private String de011TraceNo;
    private String trnDate;
} 
