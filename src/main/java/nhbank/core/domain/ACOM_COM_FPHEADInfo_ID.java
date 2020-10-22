package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_COM_FPHEADInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal hisNo;
    private String prtKind;
} 
