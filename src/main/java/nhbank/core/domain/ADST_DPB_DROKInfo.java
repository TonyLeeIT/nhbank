package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_DROK") 
@Data 
public class ADST_DPB_DROKInfo implements Serializable { 
@Id 
@GeneratedValue 
private String drOpNo; 
private String processCd; 
private String drBr; 
private String relsOpNo; 
private String relsTime; 
private String updEmpNo; 
private Date afDate; 
private int relsHisNo; 
private String acctNo; 
private String mechGb; 
private String sts; 
private Date updDt; 
private int drTrxNo; 
private Date selfMngIl; 
private Date relsIl; 
private String remark; 
private String relsMngNo; 
private int bfRt; 
private int bfNo; 
private String regEmpNo; 
private Date bfDate; 
private Date regDt; 
private String afString; 
private String bfString; 
private String drMngNo; 
private String relsBr; 
private int num2; 
private String lstTime; 
private String drTime; 
private Date baseIl; 
private int afRt; 
private int num3; 
private Date lstIbIl; 
private Date ibIl; 
private int afNo; 
private int num1; 
private int drHisNo; 
private String updTm; 
private String regTm; 
} 
