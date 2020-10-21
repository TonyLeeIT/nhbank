package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFTR_FFH_COMM_TRSC_PTCLInfo_ID implements Serializable {
    private String trscBrNo;
    private Date trscDt;
    private BigDecimal commTrscDtlsSeqNo;
    private BigDecimal commTrscSeqNo;
} 
