package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPH_ATAG")
@Data
public class AFEX_IPH_ATAGInfo implements Serializable {
    @Id
    @GeneratedValue
    private String TEXT10;
    private Date REG_DT;
    private String TEXT01;
    private String TEXT02;
    private String UPD_EMP_NO;
    private String TAG_CD;
    private Date UPD_DT;
    private String REF_NO;
    private String TEXT07;
    private String TEXT08;
    private String TEXT09;
    private String AMD_SEQ;
    private String TEXT03;
    private String UPD_TM;
    private String TEXT04;
    private int SEQ;
    private String TEXT05;
    private String TEXT06;
    private String REG_EMP_NO;
    private String REG_TM;
} 
