package nhbank.core.services;
import nhbank.core.domain.AFEX_RTB_HSSInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RTB_HSSInfoService {
	void updateAll();
	void insertAll(List<AFEX_RTB_HSSInfo> AFEX_RTB_HSSInfos);
	boolean isExist(String refNo);
}