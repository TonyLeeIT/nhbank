package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPH_ATAG") 
@Data 
public class AFEX_IPH_ATAGInfo implements Serializable { 
@Id 
@GeneratedValue 
private String text10; 
private Date regDt; 
private String text01; 
private String text02; 
private String updEmpNo; 
private String tagCd; 
private Date updDt; 
private String refNo; 
private String text07; 
private String text08; 
private String text09; 
private String amdSeq; 
private String text03; 
private String updTm; 
private String text04; 
private int seq; 
private String text05; 
private String text06; 
private String regEmpNo; 
private String regTm; 
} 
