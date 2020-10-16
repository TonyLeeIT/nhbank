package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomCixBase")
@Data
public class ACOM_CIX_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cixNo;
    private String idNo;
    private String idTp;
    private Date endIdDt;
    private String idNm;
    private String idNoKor;
    private String openBr;
    private String lstBr;
    private Date openDt;
    private Date lstDt;
    private String custEnm;
    private String custSnm;
    private String custHnm;
    private String custHsnm;
    private String addrEnm1;
    private String addrEnm2;
    private String addrEnm3;
    private String addrEnm4;
    private String addrHnm1;
    private String addrHnm2;
    private String addrHnm3;
    private String addrHnm4;
    private String addrHnm21;
    private String addrHnm22;
    private String addrHnm23;
    private String addrHnm24;
    private String postNo;
    private String postNo2;
    private String mainTelNo;
    private String telNo;
    private String telNo2;
    private String mobileNo;
    private String faxNo;
    private String cixCd;
    private String ctryCd;
    private String dmclCtryCd;
    private String gyumoCd;
    private String upjoCd;
    private String jobCd;
    private String jobPlace;
    private String jobPlcAddr1;
    private String jobPlcAddr2;
    private String jobPlcAddr3;
    private String jobPlcAddr4;
    private String jobPostNo;
    private String jobCorres;
    private String jobPos;
    private String jobYear;
    private String jobMon;
    private String jobCtryCd;
    private String occupSince;
    private String sexCd;
    private Date birthDt;
    private String birthPlace;
    private String marriageYn;
    private String houseOwnYn;
    private String bicCd;
    private String opNo;
    private String ydGuja;
    private String mngInfo;
    private String mailTp;
    private String mailAddr1;
    private String mailAddr2;
    private String mailAddr3;
    private String mailAddr4;
    private String creditGrade;
    private String emailAddr;
    private int capital;
    private int salesScale;
    private int profitExTax;
    private int asset;
    private int pdinCaptl;
    private int amtEmployee;
    private String corpTp;
    private String remarks1;
    private String remarks2;
    private String hqCixNo;
    private String hqIdNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
