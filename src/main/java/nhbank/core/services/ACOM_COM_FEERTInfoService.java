package nhbank.core.services;
import nhbank.core.domain.ACOM_COM_FEERTInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COM_FEERTInfoService {
	void updateAll();
	void insertAll(List<ACOM_COM_FEERTInfo> ACOM_COM_FEERTInfos);
	boolean isExist(String lcd, String mcd, String scd, String mngBr, Date applyIl);
}