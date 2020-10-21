package nhbank.core.services;
import nhbank.core.domain.AFEX_BFH_PAYInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_BFH_PAYInfoService {
	void updateAll();
	void insertAll(List<AFEX_BFH_PAYInfo> AFEX_BFH_PAYInfos);
	boolean isExist(String refNo, BigDecimal payCnt);
}