package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPH_RENEGO_DTO {
    private String REF_NO;
    private String STS;
    private Date TR_IL;
    private String RENE_GB;
    private String NEGO_CCY;
    private int NEGO_AMT;
    private Date NEGO_IL;
    private String REIM_BKCD;
    private String REIM_BKNM;
    private String COLL_BKCD;
    private String COLL_BKNM;
    private Date EXPR_IL;
    private String EXPR_CCY;
    private int EXPR_AMT;
    private int HIJA_AMT;
    private int DC_AMT;
    private int CABLE;
    private int COLL_AMT;
    private String CC_GB;
    private Date CC_IL;
    private String CC_RT_CD;
    private String M202_NM;
    private String M999_NM;
    private String NCU_NEGO_CCY;
    private int NCU_NEGO_AMT;
    private String YUK_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPH_RENEGO_DTO() {
    }
} 
