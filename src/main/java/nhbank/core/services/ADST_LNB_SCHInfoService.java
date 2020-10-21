package nhbank.core.services;
import nhbank.core.domain.ADST_LNB_SCHInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface ADST_LNB_SCHInfoService {
	void updateAll();
	void insertAll(List<ADST_LNB_SCHInfo> ADST_LNB_SCHInfos);
	boolean isExist(String refNo, String schGb, BigDecimal adjSeq, BigDecimal schSeq);
}