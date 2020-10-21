package nhbank.core.services;
import nhbank.core.domain.AACT_TRX_BSInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AACT_TRX_BSInfoService {
	void updateAll();
	void insertAll(List<AACT_TRX_BSInfo> AACT_TRX_BSInfos);
	boolean isExist(String refNo, BigDecimal hisNo, BigDecimal segSeq);
}