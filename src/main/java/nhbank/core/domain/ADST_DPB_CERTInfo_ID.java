package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ADST_DPB_CERTInfo_ID implements Serializable {
    private String acctNo;
    private Date ibIl;
} 
