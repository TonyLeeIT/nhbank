package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_LGM") 
@Data 
public class AFEX_IPB_LGMInfo implements Serializable { 
@Id 
@GeneratedValue 
private String updEmpNo; 
private String shipNm; 
private String sJukGb; 
private Date blBalIl; 
private String blNo; 
private int jilgBamt; 
private String sts; 
private Date updDt; 
private int jilgFamt; 
private String regEmpNo; 
private String mfcsRtCd; 
private Date blJubIl; 
private Date gisIl; 
private int lgcomDsAmt; 
private Date lgcomToIl; 
private int hisNo; 
private int amt; 
private int sseq; 
private int bojBjan2; 
private String blGb; 
private String shipCoAddr1; 
private String shipCoAddr2; 
private int seq; 
private String bojfeeGb; 
private int bojJan2; 
private Date tcLisuIl; 
private Date ymanIl; 
private int term; 
private int bldSeq; 
private String bojJukGb; 
private String lgHoiGb; 
private Date acIl; 
private String refNo; 
private int sDsAmt; 
private String csGb; 
private Date regDt; 
private String shipCo; 
private Date lstIbIl; 
private Date sYjIl; 
private int bojJukYul; 
private int lgcomFrt; 
private int jan; 
private String ccy; 
private String trGb; 
private int insHisNo; 
private Date lgcomFrIl; 
private String updTm; 
private int pSseq; 
private String termGb; 
private String regTm; 
} 
