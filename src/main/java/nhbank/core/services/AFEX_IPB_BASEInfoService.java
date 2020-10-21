package nhbank.core.services;
import nhbank.core.domain.AFEX_IPB_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_IPB_BASEInfoService {
	void updateAll();
	void insertAll(List<AFEX_IPB_BASEInfo> AFEX_IPB_BASEInfos);
	boolean isExist(String refNo);
}