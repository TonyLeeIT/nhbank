package nhbank.core.services;
import nhbank.core.domain.ACOM_EPB_HISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_EPB_HISInfoService {
	void updateAll();
	void insertAll(List<ACOM_EPB_HISInfo> ACOM_EPB_HISInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}