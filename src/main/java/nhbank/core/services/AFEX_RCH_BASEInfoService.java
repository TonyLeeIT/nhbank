package nhbank.core.services;
import nhbank.core.domain.AFEX_RCH_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RCH_BASEInfoService {
	void updateAll();
	void insertAll(List<AFEX_RCH_BASEInfo> AFEX_RCH_BASEInfos);
	boolean isExist(String cd);String bkcd);
}