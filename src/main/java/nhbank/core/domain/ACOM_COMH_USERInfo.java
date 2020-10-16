package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomComhUser")
@Data
public class ACOM_COMH_USERInfo implements Serializable {
    @Id
    @GeneratedValue
    private String opNo;
    private String password;
    private String sts;
    private Date passwdIl;
    private String opGb;
    private String knm;
    private String fnm;
    private Date openIl;
    private String openUser;
    private String cjum;
    private String ajum;
    private String sjum;
    private String grpNo;
    private String dealerNo;
    private String dealerYn;
    private String tgb;
    private String type;
    private String tseq;
    private String tellNo;
    private String grpId;
    private String ipAddr;
    private String grantYn;
    private Date loginIl;
    private Date logoutIl;
    private String loginYn;
    private String loginTime;
    private String logoutTime;
    private Date lstIbIl;
    private String seniorOpNo;
    private String oldPasswd0;
    private String oldPasswd1;
    private String oldPasswd2;
    private String oldPasswd3;
    private String oldPasswd4;
    private String oldPasswd5;
    private String oldPasswd6;
    private String oldPasswd7;
    private String oldPasswd8;
    private String oldPasswd9;
    private String passwdLock;
    private int sessTmOut;
    private String linePrt1;
    private String linePrt2;
    private String linePrt3;
    private Date expiDt;
    private String hqOpNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String randSalt;
} 
