package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_BLD")
@Data
public class AFEX_IPB_BLDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String COR_GB;
    private int IJA_AMT;
    private String SET_BKCD;
    private String UPD_EMP_NO;
    private String TRANS_GB;
    private int BLK_SSEQ;
    private String BL_NO;
    private String STS;
    private Date UPD_DT;
    private int NCU_INS_AMT;
    private String PO_GB;
    private String CHU_GB;
    private String RCV_IN;
    private String MAN_GB;
    private String REG_EMP_NO;
    private int LGB_BJAN;
    private int NCU_MI_JAN;
    private Date GIS_IL;
    private int HIS_NO;
    private int LGB_FJAN;
    private String NEGO_BKNM;
    private int DEPO_SEQ;
    private int AMT;
    private int NCU_INS_JAN;
    private Date SHIP_IL;
    private String NCU_CCY;
    private Date INS_IL;
    private String BL_GB;
    private int SEQ;
    private Date BL_YJUB_IL;
    private int MI_JAN;
    private Date TC_LISU_IL;
    private int INS_AMT;
    private String JUB_GB;
    private String REMARK10;
    private Date AC_IL;
    private String CCC_IJA_GB;
    private String BUDO_GB;
    private String REF_NO;
    private String HAJA_GB;
    private String YJ_MAN_IL;
    private int NCU_LGB_FJAN;
    private String RCV_ACCT_NO;
    private String REMARK9;
    private Date REG_DT;
    private String YUK_NO;
    private String REMARK8;
    private String INS_GAM_GB;
    private String REMARK1;
    private Date LST_IB_IL;
    private String REMARK15;
    private String REMARK3;
    private String REMARK2;
    private String REMARK5;
    private String REMARK12;
    private String REMARK4;
    private String REMARK11;
    private String REMARK7;
    private String REMARK14;
    private String REMARK6;
    private String REMARK13;
    private Date NEGO_IL;
    private String THEIR_REF;
    private String YJ_INS_IL;
    private String CCY;
    private int INS_JAN;
    private String UPD_TM;
    private String APPL_IN;
    private int NCU_AMT;
    private String REG_TM;
} 
