package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_COM_FEERTInfo_ID implements Serializable {
    private String scd;
    private String mngBr;
    private String lcd;
    private String mcd;
    private Date applyIl;
} 
