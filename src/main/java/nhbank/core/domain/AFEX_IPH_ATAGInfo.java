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
@Table(name = "afexIphAtag")
@Data
public class AFEX_IPH_ATAGInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String amdSeq;
    private String tagCd;
    private BigDecimal seq;
    private String text01;
    private String text02;
    private String text03;
    private String text04;
    private String text05;
    private String text06;
    private String text07;
    private String text08;
    private String text09;
    private String text10;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
