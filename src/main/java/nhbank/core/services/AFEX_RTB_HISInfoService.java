package nhbank.core.services;
import nhbank.core.domain.AFEX_RTB_HISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RTB_HISInfoService {
	void updateAll();
	void insertAll(List<AFEX_RTB_HISInfo> AFEX_RTB_HISInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}