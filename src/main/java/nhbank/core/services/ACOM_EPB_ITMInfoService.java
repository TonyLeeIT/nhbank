package nhbank.core.services;
import nhbank.core.domain.ACOM_EPB_ITMInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_EPB_ITMInfoService {
	void updateAll();
	void insertAll(List<ACOM_EPB_ITMInfo> ACOM_EPB_ITMInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}