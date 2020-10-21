package nhbank.core.services;
import nhbank.core.domain.ACOM_DMH_ALLOCInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_DMH_ALLOCInfoService {
	void updateAll();
	void insertAll(List<ACOM_DMH_ALLOCInfo> ACOM_DMH_ALLOCInfos);
	boolean isExist(String damboNo, String cixNo, String sngNo, BigDecimal seqNo);
}