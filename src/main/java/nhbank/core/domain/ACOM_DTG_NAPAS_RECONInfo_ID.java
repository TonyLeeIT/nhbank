package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ACOM_DTG_NAPAS_RECONInfo_ID implements Serializable {
    private String bkCd;
    private String trnDate;
    private String reconType;
    private String de032AcqCd;
    private String de041CrdAcptTrm;
    private String de011TraceNo;
} 
