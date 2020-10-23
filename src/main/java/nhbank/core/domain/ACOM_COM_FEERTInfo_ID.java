package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ACOM_COM_FEERTInfo_ID implements Serializable {
    private String lcd;
    private String mcd;
    private String scd;
    private String mngBr;
    private Date applyIl;
} 
