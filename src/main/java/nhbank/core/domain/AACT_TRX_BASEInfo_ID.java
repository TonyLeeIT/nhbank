package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AACT_TRX_BASEInfo_ID implements Serializable {
    private Date trxIl;
    private String trxBr;
} 
