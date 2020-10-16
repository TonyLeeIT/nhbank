package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomLmtItm")
@Data
public class ACOM_LMT_ITMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private int seq;
    private String trGb;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String itmCd;
    private String beAitm01;
    private String beAitm02;
    private String beAitm03;
    private String beAitm04;
    private String beAitm05;
    private String beAitm06;
    private String beAitm07;
    private String beAitm08;
    private String beAitm09;
    private String beAitm10;
    private String afAitm01;
    private String afAitm02;
    private String afAitm03;
    private String afAitm04;
    private String afAitm05;
    private String afAitm06;
    private String afAitm07;
    private String afAitm08;
    private String afAitm09;
    private String afAitm10;
    private int beNitm;
    private int afNitm;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
