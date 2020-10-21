package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_BFH_BASEInfo_ID.class)
@Table(name = "AFEX_BFH_BASE")
@Data
public class AFEX_BFH_BASEInfo implements Serializable {
    @Id
    @Column(name = "RECV_IL")
    private Date recvIl;
    @Id
    @Column(name = "SEQ_NO")
    private BigDecimal seqNo;
    @Column(name = "MAKE_IL")
    private Date makeIl;
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "COND_STS")
    private String condSts;
    @Column(name = "RECV_GB")
    private String recvGb;
    @Column(name = "RECV_BR")
    private String recvBr;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "LST_IL")
    private Date lstIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "BFT_GB")
    private String bftGb;
    @Column(name = "IGNORE_YN")
    private String ignoreYn;
    @Column(name = "RECV_DOCID")
    private String recvDocid;
    @Column(name = "PAY_CNT")
    private BigDecimal payCnt;
    @Column(name = "MSG_TYPE")
    private String msgType;
    @Column(name = "VALUE_IL")
    private Date valueIl;
    @Column(name = "RECV_CCY")
    private String recvCcy;
    @Column(name = "RECV_AMT")
    private BigDecimal recvAmt;
    @Column(name = "CUR_CCY")
    private String curCcy;
    @Column(name = "CUR_AMT")
    private BigDecimal curAmt;
    @Column(name = "SEND_REF_NO")
    private String sendRefNo;
    @Column(name = "RECV_REF_NO")
    private String recvRefNo;
    @Column(name = "SEND_DEPO")
    private String sendDepo;
    @Column(name = "SEND_BKCD")
    private String sendBkcd;
    @Column(name = "SEND_BKNM")
    private String sendBknm;
    @Column(name = "SEND_ADDR1")
    private String sendAddr1;
    @Column(name = "SEND_ADDR2")
    private String sendAddr2;
    @Column(name = "SEND_ADDR3")
    private String sendAddr3;
    @Column(name = "JG_BKCD")
    private String jgBkcd;
    @Column(name = "JG_BKNM")
    private String jgBknm;
    @Column(name = "JG_BK_ADDR1")
    private String jgBkAddr1;
    @Column(name = "JG_BK_ADDR2")
    private String jgBkAddr2;
    @Column(name = "JG_BK_ADDR3")
    private String jgBkAddr3;
    @Column(name = "JG_BK_ACCT")
    private String jgBkAcct;
    @Column(name = "BENE_BKCD")
    private String beneBkcd;
    @Column(name = "BENE_BKNM")
    private String beneBknm;
    @Column(name = "BENE_ADDR1")
    private String beneAddr1;
    @Column(name = "BENE_ADDR2")
    private String beneAddr2;
    @Column(name = "BENE_ADDR3")
    private String beneAddr3;
    @Column(name = "BENE_ACCT")
    private String beneAcct;
    @Column(name = "TAG72_INFO1")
    private String tag72Info1;
    @Column(name = "TAG72_INFO2")
    private String tag72Info2;
    @Column(name = "TAG72_INFO3")
    private String tag72Info3;
    @Column(name = "TAG72_INFO4")
    private String tag72Info4;
    @Column(name = "TAG72_INFO5")
    private String tag72Info5;
    @Column(name = "TAG72_INFO6")
    private String tag72Info6;
    @Column(name = "REG_EMP_NO")
    private String regEmpNo;
    @Column(name = "REG_DT")
    private Date regDt;
    @Column(name = "REG_TM")
    private String regTm;
    @Column(name = "UPD_EMP_NO")
    private String updEmpNo;
    @Column(name = "UPD_DT")
    private Date updDt;
    @Column(name = "UPD_TM")
    private String updTm;
    @Column(name = "INT_BKCD")
    private String intBkcd;
    @Column(name = "INT_BKNM")
    private String intBknm;
    @Column(name = "INT_ADDR1")
    private String intAddr1;
    @Column(name = "INT_ADDR2")
    private String intAddr2;
    @Column(name = "INT_ADDR3")
    private String intAddr3;
    @Column(name = "NODDCT_YN")
    private String noddctYn;
} 
