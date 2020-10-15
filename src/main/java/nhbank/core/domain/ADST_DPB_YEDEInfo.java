package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_YEDE")
@Data
public class ADST_DPB_YEDEInfo implements Serializable {
    @Id
    @GeneratedValue
    private int TBR_CK2_AMT;
    private int LON_C_JAMT;
    private int TBR_CK1_AMT;
    private String UPD_EMP_NO;
    private int DPT_N_IAMT;
    private int LON_N_IAMT;
    private String ACCT_NO;
    private int DPT_D_JAMT;
    private Date GEJUNG_IL;
    private int LON_D_JAMT;
    private int BS_JAN;
    private Date UPD_DT;
    private int DPT_C_JAMT;
    private String MODE_GB;
    private int JBR_CK4_AMT;
    private String REG_EMP_NO;
    private int TBR_CK4_AMT;
    private Date REG_DT;
    private int JBR_CK2_AMT;
    private int LON_C_IAMT;
    private int DPT_N_JAMT;
    private int DPT_D_IAMT;
    private int JBR_CK1_AMT;
    private int LON_N_JAMT;
    private int LON_D_IAMT;
    private int BS_DPT_JAN;
    private int BS_LON_JAN;
    private int DPT_C_IAMT;
    private String UPD_TM;
    private String REG_TM;
} 
