package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_DJB")
@Data
public class AFEX_IPB_DJBInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int bamt;
    private int hisNo;
    private String djbGb;
    private int jan;
    private Date lisuIl;
    private int djhGun;
    private int expGun;
    private int shGun;
    private int krSeq;
    private int blkSseq;
    private Date lstHoiIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
