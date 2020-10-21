package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPH_COVERInfo_ID.class) 
@Table(name = "AFEX_XPH_COVER") 
@Data 
public class AFEX_XPH_COVERInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "TRAN_DATE") 
private String tranDate; 
@Column(name = "LC_NO") 
private String lcNo; 
@Column(name = "ISSUE_BKNM") 
private String issueBknm; 
@Column(name = "OPEN_DATE") 
private String openDate; 
@Column(name = "IMPOT_NAME") 
private String impotName; 
@Column(name = "CURR") 
private String curr; 
@Column(name = "AMOUNT") 
private BigDecimal amount; 
@Column(name = "TENOR_GB") 
private String tenorGb; 
@Column(name = "TENOR_DAY") 
private BigDecimal tenorDay; 
@Column(name = "TENOR_CODE") 
private String tenorCode; 
@Column(name = "MATUR") 
private String matur; 
@Column(name = "DRAWER") 
private String drawer; 
@Column(name = "MAIL_BKCD") 
private String mailBkcd; 
@Column(name = "OPEN_BKNM1") 
private String openBknm1; 
@Column(name = "OPEN_BKNM2") 
private String openBknm2; 
@Column(name = "OPEN_BKNM3") 
private String openBknm3; 
@Column(name = "OPEN_BKNM4") 
private String openBknm4; 
@Column(name = "CABLE") 
private BigDecimal cable; 
@Column(name = "WHANGA") 
private BigDecimal whanga; 
@Column(name = "SEQ_NO0") 
private String seqNo0; 
@Column(name = "SEQ_NO1") 
private String seqNo1; 
@Column(name = "SEQ_NO2") 
private String seqNo2; 
@Column(name = "SEQ_NO3") 
private String seqNo3; 
@Column(name = "SEQ_NO4") 
private String seqNo4; 
@Column(name = "SEQ_NO5") 
private String seqNo5; 
@Column(name = "SEQ_NO6") 
private String seqNo6; 
@Column(name = "SEQ_NO7") 
private String seqNo7; 
@Column(name = "SEQ_NO8") 
private String seqNo8; 
@Column(name = "SEQ_NO9") 
private String seqNo9; 
@Column(name = "SEQ_NO10") 
private String seqNo10; 
@Column(name = "SEQ_NO11") 
private String seqNo11; 
@Column(name = "SEQ_NO12") 
private String seqNo12; 
@Column(name = "SEQ_NO13") 
private String seqNo13; 
@Column(name = "TREF_NO") 
private String trefNo; 
@Column(name = "LA10") 
private String la10; 
@Column(name = "LA20") 
private String la20; 
@Column(name = "LA11") 
private String la11; 
@Column(name = "LA21") 
private String la21; 
@Column(name = "LA12") 
private String la12; 
@Column(name = "LA22") 
private String la22; 
@Column(name = "LA13") 
private String la13; 
@Column(name = "LA23") 
private String la23; 
@Column(name = "LA14") 
private String la14; 
@Column(name = "LA24") 
private String la24; 
@Column(name = "LA15") 
private String la15; 
@Column(name = "LA25") 
private String la25; 
@Column(name = "TXT10") 
private String txt10; 
@Column(name = "TXT20") 
private String txt20; 
@Column(name = "TXT30") 
private String txt30; 
@Column(name = "TXT11") 
private String txt11; 
@Column(name = "TXT21") 
private String txt21; 
@Column(name = "TXT31") 
private String txt31; 
@Column(name = "TXT12") 
private String txt12; 
@Column(name = "TXT22") 
private String txt22; 
@Column(name = "TXT32") 
private String txt32; 
@Column(name = "TXT13") 
private String txt13; 
@Column(name = "TXT23") 
private String txt23; 
@Column(name = "TXT33") 
private String txt33; 
@Column(name = "TXT14") 
private String txt14; 
@Column(name = "TXT24") 
private String txt24; 
@Column(name = "TXT34") 
private String txt34; 
@Column(name = "TXT15") 
private String txt15; 
@Column(name = "TXT25") 
private String txt25; 
@Column(name = "TXT35") 
private String txt35; 
@Column(name = "TXT16") 
private String txt16; 
@Column(name = "TXT26") 
private String txt26; 
@Column(name = "TXT36") 
private String txt36; 
@Column(name = "TXT17") 
private String txt17; 
@Column(name = "TXT27") 
private String txt27; 
@Column(name = "TXT37") 
private String txt37; 
@Column(name = "TXT18") 
private String txt18; 
@Column(name = "TXT28") 
private String txt28; 
@Column(name = "TXT38") 
private String txt38; 
@Column(name = "TXT19") 
private String txt19; 
@Column(name = "TXT29") 
private String txt29; 
@Column(name = "TXT39") 
private String txt39; 
@Column(name = "TXT110") 
private String txt110; 
@Column(name = "TXT210") 
private String txt210; 
@Column(name = "TXT310") 
private String txt310; 
@Column(name = "TXT111") 
private String txt111; 
@Column(name = "TXT211") 
private String txt211; 
@Column(name = "TXT311") 
private String txt311; 
@Column(name = "TXT112") 
private String txt112; 
@Column(name = "TXT212") 
private String txt212; 
@Column(name = "TXT312") 
private String txt312; 
@Column(name = "TXT113") 
private String txt113; 
@Column(name = "TXT213") 
private String txt213; 
@Column(name = "TXT313") 
private String txt313; 
@Column(name = "TXT114") 
private String txt114; 
@Column(name = "TXT214") 
private String txt214; 
@Column(name = "TXT314") 
private String txt314; 
@Column(name = "TXT115") 
private String txt115; 
@Column(name = "TXT215") 
private String txt215; 
@Column(name = "TXT315") 
private String txt315; 
@Column(name = "TXT116") 
private String txt116; 
@Column(name = "TXT216") 
private String txt216; 
@Column(name = "TXT316") 
private String txt316; 
@Column(name = "TXT117") 
private String txt117; 
@Column(name = "TXT217") 
private String txt217; 
@Column(name = "TXT317") 
private String txt317; 
@Column(name = "TXT118") 
private String txt118; 
@Column(name = "TXT218") 
private String txt218; 
@Column(name = "TXT318") 
private String txt318; 
@Column(name = "TXT119") 
private String txt119; 
@Column(name = "TXT219") 
private String txt219; 
@Column(name = "TXT319") 
private String txt319; 
@Column(name = "TXT120") 
private String txt120; 
@Column(name = "TXT220") 
private String txt220; 
@Column(name = "TXT320") 
private String txt320; 
@Column(name = "BKNM") 
private String bknm; 
@Column(name = "ACNO") 
private String acno; 
@Column(name = "DRAFT_AMT") 
private BigDecimal draftAmt; 
@Column(name = "INT_RT") 
private BigDecimal intRt; 
@Column(name = "INT_AMT") 
private BigDecimal intAmt; 
@Column(name = "COMM_RT") 
private BigDecimal commRt; 
@Column(name = "COMM_AMT") 
private BigDecimal commAmt; 
@Column(name = "LESS_RT") 
private BigDecimal lessRt; 
@Column(name = "LESS_AMT") 
private BigDecimal lessAmt; 
@Column(name = "TOTAL") 
private BigDecimal total; 
@Column(name = "DPDA") 
private String dpda; 
@Column(name = "BR_NAME") 
private String brName; 
@Column(name = "TEL_NO") 
private String telNo; 
@Column(name = "DRAW_BIC") 
private String drawBic; 
@Column(name = "DRAWBK_NAME1") 
private String drawbkName1; 
@Column(name = "DRAWBK_NAME2") 
private String drawbkName2; 
@Column(name = "DRAWBK_NAME3") 
private String drawbkName3; 
@Column(name = "BKNM1") 
private String bknm1; 
@Column(name = "NEGO_DATE") 
private String negoDate; 
@Column(name = "MT742_GB") 
private String mt742Gb; 
@Column(name = "MT754_GB") 
private String mt754Gb; 
@Column(name = "MT799_GB") 
private String mt799Gb; 
@Column(name = "MT999_GB") 
private String mt999Gb; 
@Column(name = "DISCRE_CCY") 
private String discreCcy; 
@Column(name = "DISCRE_AMT") 
private BigDecimal discreAmt; 
@Column(name = "CABLE_CCY") 
private String cableCcy; 
@Column(name = "CABLE_AMT") 
private BigDecimal cableAmt; 
@Column(name = "TAG72_1") 
private String tag721; 
@Column(name = "TAG72_2") 
private String tag722; 
@Column(name = "TAG72_3") 
private String tag723; 
@Column(name = "TAG72_4") 
private String tag724; 
@Column(name = "TAG72_5") 
private String tag725; 
@Column(name = "TAG72_6") 
private String tag726; 
@Column(name = "TAG72_7") 
private String tag727; 
@Column(name = "TAG72_8") 
private String tag728; 
@Column(name = "TAG72_9") 
private String tag729; 
@Column(name = "TAG72_10") 
private String tag7210; 
@Column(name = "TAG79_1") 
private String tag791; 
@Column(name = "TAG79_2") 
private String tag792; 
@Column(name = "TAG79_3") 
private String tag793; 
@Column(name = "TAG79_4") 
private String tag794; 
@Column(name = "TAG79_5") 
private String tag795; 
@Column(name = "TAG79_6") 
private String tag796; 
@Column(name = "TAG79_7") 
private String tag797; 
@Column(name = "TAG79_8") 
private String tag798; 
@Column(name = "TAG79_9") 
private String tag799; 
@Column(name = "TAG79_10") 
private String tag7910; 
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
@Column(name = "TAG71_1") 
private String tag711; 
@Column(name = "TAG71_2") 
private String tag712; 
@Column(name = "TAG71_3") 
private String tag713; 
@Column(name = "TAG71_4") 
private String tag714; 
@Column(name = "TAG71_5") 
private String tag715; 
@Column(name = "TAG71_6") 
private String tag716; 
@Column(name = "APPL_NM") 
private String applNm; 
@Column(name = "LOAD_PORT_CTRY") 
private String loadPortCtry; 
@Column(name = "DISC_PORT_CTRY") 
private String discPortCtry; 
@Column(name = "ORGN_CTRY") 
private String orgnCtry; 
@Column(name = "CMMDT") 
private String cmmdt; 
@Column(name = "SHIP_NM") 
private String shipNm; 
@Column(name = "SHIP_CTRY") 
private String shipCtry; 
} 
