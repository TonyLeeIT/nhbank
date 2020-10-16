package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "afexIphCover")
@Data
public class AFEX_IPH_COVERInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seq;
    private Date tranDate;
    private Date dueDate;
    private String ipCd;
    private String ccy;
    private BigDecimal amount;
    private String trefNo;
    private String negoBkcd;
    private String negoBknm;
    private String reimBkcd;
    private String reimBknm;
    private String drawer;
    private String tenorGb;
    private BigDecimal tenorDay;
    private String tenorCode;
    private String hajaGb;
    private String commGb1;
    private String handCcy;
    private BigDecimal handAmt;
    private String commGb2;
    private String cableCcy;
    private BigDecimal cableAmt;
    private String commGb3;
    private String lieuCcy;
    private BigDecimal lieuAmt;
    private String commGb4;
    private String etcCcy;
    private BigDecimal etcAmt;
    private BigDecimal overdrawAmt;
    private String acNo;
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
    private String txt11;
    private String txt21;
    private String txt12;
    private String txt22;
    private String txt13;
    private String txt23;
    private String txt14;
    private String txt24;
    private String txt15;
    private String txt25;
    private String txt16;
    private String txt26;
    private String txt17;
    private String txt27;
    private String txt18;
    private String txt28;
    private String txt19;
    private String txt29;
    private String txt110;
    private String txt210;
    private String txt111;
    private String txt211;
    private String txt112;
    private String txt212;
    private String txt113;
    private String txt213;
    private String txt114;
    private String txt214;
    private String txt115;
    private String txt215;
    private String txt116;
    private String txt216;
    private String txt117;
    private String txt217;
    private String txt118;
    private String txt218;
    private String vessel;
    private String voyage;
    private String commodity1;
    private String commodity2;
    private String contractNo;
    private String hajaCd1;
    private String hajaCd2;
    private String hajaCd3;
    private String hajaCd4;
    private String hajaCd5;
    private String hajaCd6;
    private String hajaCd7;
    private String hajaCd8;
    private String hajaCd9;
    private String hajaCd10;
    private String hajaCd11;
    private String hajaCd12;
    private String hajaCd13;
    private String hajaCd14;
    private String hajaCd15;
    private String hajaCd16;
    private String hajaCd17;
    private String hajaCd18;
    private String hajaCd19;
    private String hajaSayu;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String loadPortCtry;
    private String discPortCtry;
    private String orgnCtry;
    private String shipCtry;
} 
