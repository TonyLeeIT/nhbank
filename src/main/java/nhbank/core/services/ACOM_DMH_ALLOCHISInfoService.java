package nhbank.core.services;
import nhbank.core.domain.ACOM_DMH_ALLOCHISInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_DMH_ALLOCHISInfoService {
	void updateAll();
	void insertAll(List<ACOM_DMH_ALLOCHISInfo> ACOM_DMH_ALLOCHISInfos);
	boolean isExist(String damboNo, String cixNo, String sngNo, BigDecimal seqNo, BigDecimal hisNo);
}