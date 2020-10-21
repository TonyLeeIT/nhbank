package nhbank.core.services;
import nhbank.core.domain.ACOM_CIX_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_CIX_BASEInfoService {
	void updateAll();
	void insertAll(List<ACOM_CIX_BASEInfo> ACOM_CIX_BASEInfos);
	boolean isExist(String cixNo);
}