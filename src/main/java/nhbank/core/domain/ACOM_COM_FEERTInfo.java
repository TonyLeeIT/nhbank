package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_FEERT") 
@Data 
public class ACOM_COM_FEERTInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private int maxFee; 
private String updEmpNo; 
private int frt; 
private String lcd; 
private String cdNm; 
private String mcd; 
private Date applyIl; 
private String plCd; 
private int minFee; 
private String scd; 
private Date updDt; 
private Date makeIl; 
private String mngBr; 
private int etcFrt; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
