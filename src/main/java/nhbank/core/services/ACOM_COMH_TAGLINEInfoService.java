package nhbank.core.services;
import nhbank.core.domain.ACOM_COMH_TAGLINEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_COMH_TAGLINEInfoService {
	void updateAll();
	void insertAll(List<ACOM_COMH_TAGLINEInfo> ACOM_COMH_TAGLINEInfos);
	boolean isExist(String docId, BigDecimal seqNo);
}