package nhbank.core.services;
import nhbank.core.domain.AFEX_IPB_DJBInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_IPB_DJBInfoService {
	void updateAll();
	void insertAll(List<AFEX_IPB_DJBInfo> AFEX_IPB_DJBInfos);
	boolean isExist(String refNo, BigDecimal seq);
}