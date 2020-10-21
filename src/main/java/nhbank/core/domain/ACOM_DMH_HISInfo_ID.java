package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DMH_HISInfo_ID implements Serializable {
    private String damboNo;
    private String damboCd;
    private BigDecimal hisNo;
    private String cixNo;
} 
