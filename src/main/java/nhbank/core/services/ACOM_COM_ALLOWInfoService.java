package nhbank.core.services;
import nhbank.core.domain.ACOM_COM_ALLOWInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COM_ALLOWInfoService {
	void updateAll();
	void insertAll(List<ACOM_COM_ALLOWInfo> ACOM_COM_ALLOWInfos);
	boolean isExist(String refNo);
}