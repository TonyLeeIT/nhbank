package nhbank.core.services;
import nhbank.core.domain.ACOM_COMH_MSGInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COMH_MSGInfoService {
	void updateAll();
	void insertAll(List<ACOM_COMH_MSGInfo> ACOM_COMH_MSGInfos);
	boolean isExist(String docId);
}