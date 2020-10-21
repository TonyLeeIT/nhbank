package nhbank.core.services;
import nhbank.core.domain.ACOM_LMT_BASEACTInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_LMT_BASEACTInfoService {
	void updateAll();
	void insertAll(List<ACOM_LMT_BASEACTInfo> ACOM_LMT_BASEACTInfos);
	boolean isExist(String sngNo, String actCd);
}