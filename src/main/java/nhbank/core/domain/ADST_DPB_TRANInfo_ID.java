package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_DPB_TRANInfo_ID implements Serializable {
    private BigDecimal trxNo;
    private String acctNo;
    private Date ibIl;
} 
