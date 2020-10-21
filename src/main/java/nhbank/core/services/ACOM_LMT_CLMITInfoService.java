package nhbank.core.services;
import nhbank.core.domain.ACOM_LMT_CLMITInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_LMT_CLMITInfoService {
	void updateAll();
	void insertAll(List<ACOM_LMT_CLMITInfo> ACOM_LMT_CLMITInfos);
	boolean isExist(String laInspRcno, BigDecimal chgSqno);
}