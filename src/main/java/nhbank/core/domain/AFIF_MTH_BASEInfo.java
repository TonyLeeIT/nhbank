package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFIF_MTH_BASE")
@Data
public class AFIF_MTH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String FRONT_ID;
    private String TO_DEPO_CD;
    private String TAG21;
    private String TAG57_NM;
    private Date DEAL_IL;
    private Date VALUE_IL;
    private String UPD_EMP_NO;
    private String USER_ID;
    private String DEAL_TYPE;
    private String TAG56_A_BIC;
    private String TAG72_INFO1;
    private String TAG72_INFO2;
    private Date LST_DEAL_IL;
    private String TAG72_INFO3;
    private Date UPD_DT;
    private String REF_NO;
    private String TAG58_BIC;
    private String PO_YN;
    private String VALUE_YN;
    private String FROM_DEPO_NM;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String TO_DEPO_NM;
    private String TAG58_NM;
    private String TAG57_BIC;
    private int AMT;
    private String TO_CCY;
    private Date LST_IB_IL;
    private String TAG53_B;
    private Date PO_IL;
    private Date FST_IB_IL;
    private int PO_SEQ;
    private String TAG56_A_NM;
    private String CCY;
    private String TAG56_D_BIC_NAME2;
    private String TAG56_D_BIC_NAME1;
    private String TAG56_D_BIC_NAME4;
    private String TAG56_D_BIC_NAME3;
    private String UPD_TM;
    private String FROM_DEPO_CD;
    private String REG_TM;
} 
