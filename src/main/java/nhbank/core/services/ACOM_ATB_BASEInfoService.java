package nhbank.core.services;
import nhbank.core.domain.ACOM_ATB_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_ATB_BASEInfoService {
	void updateAll();
	void insertAll(List<ACOM_ATB_BASEInfo> ACOM_ATB_BASEInfos);
	boolean isExist(String refNo);
}