package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_ACTCD") 
@Data 
public class ACOM_COM_ACTCDInfo implements Serializable { 
@Id 
@GeneratedValue 
private String bokGb; 
private String sysGb; 
private String bsplGb; 
private String enm; 
private String contraAc; 
private String hnm; 
private String fbGb; 
private String updEmpNo; 
private String lnm; 
private String esnm; 
private String fssNm; 
private Date updDt; 
private String amrtAc; 
private String brNo; 
private String ibfGb; 
private String oldCd3; 
private String oldCd2; 
private String susGb; 
private String oldCd1; 
private String regEmpNo; 
private Date regDt; 
private String bcd; 
private String lsnm; 
private String acKd; 
private String hsnm; 
private String acCd; 
private String cd2; 
private String mnblGb; 
private String accrAc; 
private String cd1; 
private String cd4; 
private String cd3; 
private String cd5; 
private String fssCd; 
private int acSort2; 
private int acSort1; 
private String trGb; 
private String bldrcrGb; 
private String refctlGb; 
private String contraGb; 
private String updTm; 
private String bokCd; 
private String regTm; 
} 
