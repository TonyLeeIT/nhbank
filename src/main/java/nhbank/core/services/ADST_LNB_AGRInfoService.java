package nhbank.core.services;
import nhbank.core.domain.ADST_LNB_AGRInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_LNB_AGRInfoService {
	void updateAll();
	void insertAll(List<ADST_LNB_AGRInfo> ADST_LNB_AGRInfos);
	boolean isExist(String refNo);
}