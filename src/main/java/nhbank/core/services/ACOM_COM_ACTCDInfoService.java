package nhbank.core.services;
import nhbank.core.domain.ACOM_COM_ACTCDInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COM_ACTCDInfoService {
	void updateAll();
	void insertAll(List<ACOM_COM_ACTCDInfo> ACOM_COM_ACTCDInfos);
	boolean isExist(String brNo, String bsplGb, String acCd);
}