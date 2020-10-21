package nhbank.core.services;
import nhbank.core.domain.AFIF_MTH_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFIF_MTH_BASEInfoService {
	void updateAll();
	void insertAll(List<AFIF_MTH_BASEInfo> AFIF_MTH_BASEInfos);
	boolean isExist(String refNo);
}