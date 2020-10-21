package nhbank.core.services;
import nhbank.core.domain.AFEX_XPB_ITMInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_XPB_ITMInfoService {
	void updateAll();
	void insertAll(List<AFEX_XPB_ITMInfo> AFEX_XPB_ITMInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}