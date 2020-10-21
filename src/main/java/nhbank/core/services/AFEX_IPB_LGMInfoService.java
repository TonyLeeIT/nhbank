package nhbank.core.services;
import nhbank.core.domain.AFEX_IPB_LGMInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_IPB_LGMInfoService {
	void updateAll();
	void insertAll(List<AFEX_IPB_LGMInfo> AFEX_IPB_LGMInfos);
	boolean isExist(String refNo, BigDecimal seq);BigDecimal sseq);
}