package nhbank.core.services;
import nhbank.core.domain.AFEX_RTB_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RTB_BASEInfoService {
	void updateAll();
	void insertAll(List<AFEX_RTB_BASEInfo> AFEX_RTB_BASEInfos);
	boolean isExist(String refNo);
}