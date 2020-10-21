package nhbank.core.services;
import nhbank.core.domain.ACOM_LMT_BOJInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_LMT_BOJInfoService {
	void updateAll();
	void insertAll(List<ACOM_LMT_BOJInfo> ACOM_LMT_BOJInfos);
	boolean isExist(String sngNo, BigDecimal seq);
}