package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_HEJI") 
@Data 
public class ADST_DPB_HEJIInfo implements Serializable { 
@Id 
@GeneratedValue 
private int depCnt; 
private int dptRt; 
private int trxNo; 
private int totPayAamt; 
private String trCd; 
private int afIntAamt; 
private int rtnTax4Amt; 
private String updEmpNo; 
private int rtnIntAamt; 
private String acctNo; 
private int tax3Amt; 
private String mechGb; 
private int bfIntBamt; 
private int tax1Amt; 
private Date clsIl; 
private String sts; 
private Date updDt; 
private int rtnTax1Amt; 
private String ibTime; 
private int tax2Amt; 
private int clsFee; 
private Date canIl; 
private int clsAamt; 
private String regEmpNo; 
private String bfCixNo; 
private String opNo; 
private Date regDt; 
private Date gisIl; 
private int taxRt; 
private int totPayBamt; 
private int rtnTax2Amt; 
private int hisNo; 
private int afIntBamt; 
private int rtnIntBamt; 
private Date ibIl; 
private int bfIntAamt; 
private int pnltAmt; 
private int rtnTax3Amt; 
private int tax4Amt; 
private String updTm; 
private int clsBamt; 
private String regTm; 
} 
