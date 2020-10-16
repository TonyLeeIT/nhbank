package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFIF_MTH_BASE")
@Data
public class AFIF_MTH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private Date dealIl;
    private String dealType;
    private String valueYn;
    private Date valueIl;
    private String ccy;
    private int amt;
    private String fromDepoCd;
    private String fromDepoNm;
    private String toCcy;
    private String toDepoCd;
    private String toDepoNm;
    private String poYn;
    private Date poIl;
    private int poSeq;
    private String tag21;
    private String tag53B;
    private String tag56ABic;
    private String tag56ANm;
    private String tag56DBicName1;
    private String tag56DBicName2;
    private String tag56DBicName3;
    private String tag56DBicName4;
    private String tag57Bic;
    private String tag57Nm;
    private String tag58Bic;
    private String tag58Nm;
    private String tag72Info1;
    private String tag72Info2;
    private String tag72Info3;
    private Date fstIbIl;
    private Date lstDealIl;
    private Date lstIbIl;
    private String userId;
    private String frontId;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
