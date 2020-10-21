package nhbank.core.services;
import nhbank.core.domain.AFIF_MMH_HISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFIF_MMH_HISInfoService {
	void updateAll();
	void insertAll(List<AFIF_MMH_HISInfo> AFIF_MMH_HISInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}