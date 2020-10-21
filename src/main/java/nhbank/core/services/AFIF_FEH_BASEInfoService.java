package nhbank.core.services;
import nhbank.core.domain.AFIF_FEH_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFIF_FEH_BASEInfoService {
	void updateAll();
	void insertAll(List<AFIF_FEH_BASEInfo> AFIF_FEH_BASEInfos);
	boolean isExist(String refNo);
}