package nhbank.core.services;
import nhbank.core.domain.AFEX_ROH_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_ROH_BASEInfoService {
	void updateAll();
	void insertAll(List<AFEX_ROH_BASEInfo> AFEX_ROH_BASEInfos);
	boolean isExist(String refNo);
}