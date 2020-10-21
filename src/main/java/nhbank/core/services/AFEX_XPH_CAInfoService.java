package nhbank.core.services;
import nhbank.core.domain.AFEX_XPH_CAInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_XPH_CAInfoService {
	void updateAll();
	void insertAll(List<AFEX_XPH_CAInfo> AFEX_XPH_CAInfos);
	boolean isExist(Date rcvIl, BigDecimal seqNo);
}