package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexIpbDjh")
@Data
public class AFEX_IPB_DJHInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seq;
    private int sseq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int bamt;
    private int ijaBamt;
    private int hisNo;
    private String hoiGb;
    private int dsAmt;
    private int ijaFrt;
    private int ijaDsTerm;
    private Date ijaFrIl;
    private Date ijaToIl;
    private Date beLstHoiIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
