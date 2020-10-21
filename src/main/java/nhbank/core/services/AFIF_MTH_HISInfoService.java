package nhbank.core.services;
import nhbank.core.domain.AFIF_MTH_HISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFIF_MTH_HISInfoService {
	void updateAll();
	void insertAll(List<AFIF_MTH_HISInfo> AFIF_MTH_HISInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}