package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_EPB_HIS") 
@Data 
public class ACOM_EPB_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String linkRefNo; 
private String payRefNo; 
private String trCd; 
private int assignAmt; 
private int sdHis; 
private String mngNo; 
private String updEmpNo; 
private String cdSngNo; 
private int trTax; 
private String sdBr; 
private int cdSilSeq; 
private String sts; 
private String dnGb; 
private Date acIl; 
private int trBamt; 
private Date updDt; 
private String linkType; 
private String refNo; 
private int trFamt; 
private String ibTime; 
private String remark; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private String sdBusiCd; 
private Date gisIl; 
private String cptyNm; 
private String autoYn; 
private int sdHisNo; 
private int hisNo; 
private int afJan; 
private Date ibIl; 
private String sdRefNo; 
private String trBr; 
private int taxRate; 
private String trGb; 
private String updTm; 
private String taxCode; 
private String trCcy; 
private String regTm; 
} 
