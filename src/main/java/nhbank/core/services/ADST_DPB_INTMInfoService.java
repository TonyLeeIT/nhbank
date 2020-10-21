package nhbank.core.services;
import nhbank.core.domain.ADST_DPB_INTMInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_DPB_INTMInfoService {
	void updateAll();
	void insertAll(List<ADST_DPB_INTMInfo> ADST_DPB_INTMInfos);
	boolean isExist(String acctNo, Date ibIl, Date gisIl, BigDecimal intSeq);
}