package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_ROB_AMD") 
@Data 
public class AFEX_ROB_AMDInfo implements Serializable { 
@Id 
@GeneratedValue 
private String rcvBkAddr1; 
private String tblGb; 
private String rcvBkAddr2; 
private String applNm2; 
private String rcvBkAddr3; 
private String applNm1; 
private String updEmpNo; 
private String sts; 
private Date updDt; 
private Date lstIl; 
private String applAddr1; 
private String applAddr2; 
private String applAddr3; 
private String regEmpNo; 
private String opNo; 
private Date gisIl; 
private String rcvNm2; 
private String rcvNm1; 
private String ownerNo; 
private int hisNo; 
private String rcvBkAcno; 
private String ydGuja; 
private String mt199Name; 
private int chgSeq; 
private String info72Name1; 
private String baseSts; 
private String info72Name2; 
private String info72Name3; 
private String info72Name4; 
private String info72Name5; 
private String info72Name6; 
private String canGb; 
private String operNo; 
private String chgCd; 
private Date acIl; 
private String infoName6; 
private String infoName5; 
private String refNo; 
private String infoName4; 
private String infoName3; 
private String infoName2; 
private String infoName1; 
private String rcvAcctNo; 
private String mjGb; 
private String mt192Name; 
private Date regDt; 
private String ibjiMd; 
private String rcvBknm2; 
private String rcvAddr1; 
private String rcvAddr2; 
private Date lstIbIl; 
private String rcvAddr3; 
private String interBank2; 
private String interBank1; 
private String rcvBknm1; 
private String updTm; 
private String regTm; 
} 
