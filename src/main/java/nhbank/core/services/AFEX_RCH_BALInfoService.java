package nhbank.core.services;
import nhbank.core.domain.AFEX_RCH_BALInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RCH_BALInfoService {
	void updateAll();
	void insertAll(List<AFEX_RCH_BALInfo> AFEX_RCH_BALInfos);
	boolean isExist(String cd, String ccy, Date trIl);
}