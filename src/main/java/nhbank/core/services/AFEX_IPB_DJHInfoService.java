package nhbank.core.services;
import nhbank.core.domain.AFEX_IPB_DJHInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_IPB_DJHInfoService {
	void updateAll();
	void insertAll(List<AFEX_IPB_DJHInfo> AFEX_IPB_DJHInfos);
	boolean isExist(String refNo, BigDecimal seq);BigDecimal sseq);
}