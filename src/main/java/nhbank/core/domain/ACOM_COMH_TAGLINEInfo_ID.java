package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ACOM_COMH_TAGLINEInfo_ID implements Serializable {
    private String docId;
    private BigDecimal seqNo;
} 
