package nhbank.core.services;
import nhbank.core.domain.ACOM_DTG_NAPAS_RECONInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ACOM_DTG_NAPAS_RECONInfoService {
	void updateAll();
	void insertAll(List<ACOM_DTG_NAPAS_RECONInfo> ACOM_DTG_NAPAS_RECONInfos);
	boolean isExist(String bkCd, String trnDate, String reconType, String de032AcqCd, String de041CrdAcptTrm, String de011TraceNo);
}