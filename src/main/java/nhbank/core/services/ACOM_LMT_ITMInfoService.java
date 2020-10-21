package nhbank.core.services;
import nhbank.core.domain.ACOM_LMT_ITMInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_LMT_ITMInfoService {
	void updateAll();
	void insertAll(List<ACOM_LMT_ITMInfo> ACOM_LMT_ITMInfos);
	boolean isExist(String sngNo, BigDecimal seq);
}