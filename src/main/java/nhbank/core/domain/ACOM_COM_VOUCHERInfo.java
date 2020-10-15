package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COM_VOUCHER")
@Data
public class ACOM_COM_VOUCHERInfo implements Serializable {
    @Id
    @GeneratedValue
    private String TR_CD;
    private String FREE_TEXT8;
    private String PRT_GB;
    private String OP_NAME;
    private String UPMU_CD;
    private String FREE_TEXT4;
    private String UPD_EMP_NO;
    private String FREE_TEXT5;
    private String FREE_TEXT6;
    private String FREE_TEXT7;
    private String FREE_TEXT1;
    private int VOUCHER_NO;
    private String BENEF;
    private String FREE_TEXT2;
    private String FREE_TEXT3;
    private String TRX_DT;
    private String AC_IL;
    private String TELL_NO;
    private Date UPD_DT;
    private String REF_NO;
    private String OTHER_REF_NO;
    private String REMARK;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date REG_DT;
    private int HIS_NO;
    private String CIX_NAME;
    private String CIX_NO;
    private String TRX_NAME;
    private String UPD_TM;
    private String AC_BR;
    private int PRT_SEQ;
    private String REG_TM;
} 
