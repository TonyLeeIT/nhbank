package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_DMH_HISInfo_ID implements Serializable {
    private String cixNo;
    private String damboNo;
    private BigDecimal hisNo;
    private String sts;
} 
