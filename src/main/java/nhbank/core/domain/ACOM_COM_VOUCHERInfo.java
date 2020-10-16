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
    private String acIl;
    private String acBr;
    private String refNo;
    private int hisNo;
    private String otherRefNo;
    private String upmuCd;
    private String trCd;
    private String trxName;
    private String trxDt;
    private String cixNo;
    private String cixName;
    private String tellNo;
    private String benef;
    private String remark;
    private String freeText1;
    private String freeText2;
    private String freeText3;
    private String freeText4;
    private String freeText5;
    private String freeText6;
    private String freeText7;
    private String freeText8;
    private String prtGb;
    private String opNo;
    private String opName;
    private int voucherNo;
    private int prtSeq;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
