package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DMH_ALLOCInfo_ID implements Serializable {
    private String damboNo;
    private String cixNo;
    private String sngNo;
    private BigDecimal seqNo;
} 
