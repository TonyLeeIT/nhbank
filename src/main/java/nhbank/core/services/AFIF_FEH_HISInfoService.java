package nhbank.core.services;
import nhbank.core.domain.AFIF_FEH_HISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFIF_FEH_HISInfoService {
	void updateAll();
	void insertAll(List<AFIF_FEH_HISInfo> AFIF_FEH_HISInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}