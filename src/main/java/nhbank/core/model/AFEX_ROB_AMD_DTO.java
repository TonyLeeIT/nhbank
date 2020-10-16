package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_ROB_AMD_DTO {
    private String REF_NO;
    private BigDecimal CHG_SEQ;
    private String TBL_GB;
    private String STS;
    private String CHG_CD;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IL;
    private Date LST_IB_IL;
    private String IBJI_MD;
    private String INFO_NAME1;
    private String INFO_NAME2;
    private String INFO_NAME3;
    private String INFO_NAME4;
    private String INFO_NAME5;
    private String INFO_NAME6;
    private String APPL_NM1;
    private String APPL_NM2;
    private String APPL_ADDR1;
    private String APPL_ADDR2;
    private String APPL_ADDR3;
    private String RCV_NM1;
    private String RCV_NM2;
    private String RCV_ADDR1;
    private String RCV_ADDR2;
    private String RCV_ADDR3;
    private String RCV_ACCT_NO;
    private String RCV_BK_ACNO;
    private String RCV_BKNM1;
    private String RCV_BKNM2;
    private String RCV_BK_ADDR1;
    private String RCV_BK_ADDR2;
    private String RCV_BK_ADDR3;
    private String MJ_GB;
    private String OP_NO;
    private String OWNER_NO;
    private String YD_GUJA;
    private BigDecimal HIS_NO;
    private String OPER_NO;
    private String MT199_NAME;
    private String MT192_NAME;
    private String BASE_STS;
    private String CAN_GB;
    private String INTER_BANK1;
    private String INTER_BANK2;
    private String INFO72_NAME1;
    private String INFO72_NAME2;
    private String INFO72_NAME3;
    private String INFO72_NAME4;
    private String INFO72_NAME5;
    private String INFO72_NAME6;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_ROB_AMD_DTO() {
    }
} 
