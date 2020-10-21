package nhbank.core.services;
import nhbank.core.domain.AFEX_XPH_RENEGOInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_XPH_RENEGOInfoService {
	void updateAll();
	void insertAll(List<AFEX_XPH_RENEGOInfo> AFEX_XPH_RENEGOInfos);
	boolean isExist(String refNo);
}