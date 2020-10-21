package nhbank.core.services;
import nhbank.core.domain.ADST_LNB_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_LNB_BASEInfoService {
	void updateAll();
	void insertAll(List<ADST_LNB_BASEInfo> ADST_LNB_BASEInfos);
	boolean isExist(String refNo);
}