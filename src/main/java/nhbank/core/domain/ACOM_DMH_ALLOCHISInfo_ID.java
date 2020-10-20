package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DMH_ALLOCHISInfo_ID implements Serializable {
    private String damboNo;
    private BigDecimal seqNo;
    private BigDecimal hisNo;
    private String sngNo;
    private String cixNo;
} 
