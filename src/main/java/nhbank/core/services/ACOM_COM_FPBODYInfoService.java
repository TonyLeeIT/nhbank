package nhbank.core.services;
import nhbank.core.domain.ACOM_COM_FPBODYInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COM_FPBODYInfoService {
	void updateAll();
	void insertAll(List<ACOM_COM_FPBODYInfo> ACOM_COM_FPBODYInfos);
	boolean isExist(String refNo, BigDecimal hisNo, String prtKind, BigDecimal lineSeq);
}