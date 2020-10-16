package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPH_BTAG")
@Data
public class AFEX_IPH_BTAGInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String tagCd;
    private int seq;
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
    private String text11;
    private String text12;
    private String text13;
    private String text14;
    private String text15;
    private String text16;
    private String text17;
    private String text18;
    private String text19;
    private String text20;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
