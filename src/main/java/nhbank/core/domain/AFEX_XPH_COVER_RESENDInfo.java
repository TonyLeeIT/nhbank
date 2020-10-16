package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexXphCoverResend")
@Data
public class AFEX_XPH_COVER_RESENDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int bhSeq;
    private String sts;
    private int hisNo;
    private String tranDate;
    private String lcNo;
    private String issueBknm;
    private String openDate;
    private String impotName;
    private String curr;
    private int amount;
    private String tenorGb;
    private int tenorDay;
    private String tenorCode;
    private String matur;
    private String drawer;
    private String mailBkcd;
    private String openBknm1;
    private String openBknm2;
    private String openBknm3;
    private String openBknm4;
    private int cable;
    private int whanga;
    private String seqNo0;
    private String seqNo1;
    private String seqNo2;
    private String seqNo3;
    private String seqNo4;
    private String seqNo5;
    private String seqNo6;
    private String seqNo7;
    private String seqNo8;
    private String seqNo9;
    private String seqNo10;
    private String seqNo11;
    private String seqNo12;
    private String seqNo13;
    private String trefNo;
    private String la10;
    private String la20;
    private String la11;
    private String la21;
    private String la12;
    private String la22;
    private String la13;
    private String la23;
    private String txt10;
    private String txt20;
    private String txt30;
    private String txt11;
    private String txt21;
    private String txt31;
    private String txt12;
    private String txt22;
    private String txt32;
    private String txt13;
    private String txt23;
    private String txt33;
    private String txt14;
    private String txt24;
    private String txt34;
    private String txt15;
    private String txt25;
    private String txt35;
    private String txt16;
    private String txt26;
    private String txt36;
    private String txt17;
    private String txt27;
    private String txt37;
    private String txt18;
    private String txt28;
    private String txt38;
    private String txt19;
    private String txt29;
    private String txt39;
    private String txt110;
    private String txt210;
    private String txt310;
    private String txt111;
    private String txt211;
    private String txt311;
    private String txt112;
    private String txt212;
    private String txt312;
    private String txt113;
    private String txt213;
    private String txt313;
    private String txt114;
    private String txt214;
    private String txt314;
    private String txt115;
    private String txt215;
    private String txt315;
    private String txt116;
    private String txt216;
    private String txt316;
    private String txt117;
    private String txt217;
    private String txt317;
    private String txt118;
    private String txt218;
    private String txt318;
    private String bknm;
    private String acno;
    private int draftAmt;
    private int intRt;
    private int intAmt;
    private int commRt;
    private int commAmt;
    private int lessRt;
    private int lessAmt;
    private int total;
    private String dpda;
    private String brName;
    private String telNo;
    private String drawBic;
    private String drawbkName1;
    private String drawbkName2;
    private String drawbkName3;
    private String bknm1;
    private String negoDate;
    private int discreAmt;
    private int cableAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
