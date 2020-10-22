package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(ACOM_CIX_LOCALInfo_ID.class)
@Table(name = "ACOM_CIX_LOCAL")
@Data
public class ACOM_CIX_LOCALInfo implements Serializable {
    @Id
    @Column(name = "CIX_NO")
    private String cixNo;
    @Id
    @Column(name = "ITEM_NM")
    private String itemNm;
    @Column(name = "ITEM_CTT")
    private String itemCtt;
    @Column(name = "REG_DV_CD")
    private String regDvCd;
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
} 
