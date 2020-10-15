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
    private String TEXT10;
    private String TEXT11;
    private String TEXT12;
    private String TEXT13;
    private String UPD_EMP_NO;
    private String TAG_CD;
    private Date UPD_DT;
    private String REF_NO;
    private String TEXT18;
    private String TEXT19;
    private String TEXT14;
    private String TEXT15;
    private String TEXT16;
    private String TEXT17;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String TEXT01;
    private String TEXT02;
    private String TEXT20;
    private String TEXT07;
    private String TEXT08;
    private String TEXT09;
    private String TEXT03;
    private String UPD_TM;
    private String TEXT04;
    private int SEQ;
    private String TEXT05;
    private String TEXT06;
    private String REG_TM;
} 
