package nhbank.core.services;
import nhbank.core.domain.ACOM_ATB_APPLYInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_ATB_APPLYInfoService {
	void updateAll();
	void insertAll(List<ACOM_ATB_APPLYInfo> ACOM_ATB_APPLYInfos);
	boolean isExist(String applyNo);
}