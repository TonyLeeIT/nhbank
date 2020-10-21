package nhbank.core.services;
import nhbank.core.domain.ACOM_COMH_USERInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COMH_USERInfoService {
	void updateAll();
	void insertAll(List<ACOM_COMH_USERInfo> ACOM_COMH_USERInfos);
	boolean isExist(String opNo);
}