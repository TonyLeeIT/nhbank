package nhbank.core.services;
import nhbank.core.domain.ACOM_LMT_SILInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_LMT_SILInfoService {
	void updateAll();
	void insertAll(List<ACOM_LMT_SILInfo> ACOM_LMT_SILInfos);
	boolean isExist(String sngNo, String actCd, String silCcy);
}