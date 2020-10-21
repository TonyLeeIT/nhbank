package nhbank.core.services;
import nhbank.core.domain.AACT_TRX_PLInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AACT_TRX_PLInfoService {
	void updateAll();
	void insertAll(List<AACT_TRX_PLInfo> AACT_TRX_PLInfos);
	boolean isExist(String refNo, BigDecimal hisNo, BigDecimal segSeq);
}