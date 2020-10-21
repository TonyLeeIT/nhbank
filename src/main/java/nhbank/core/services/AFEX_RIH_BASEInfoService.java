package nhbank.core.services;
import nhbank.core.domain.AFEX_RIH_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RIH_BASEInfoService {
	void updateAll();
	void insertAll(List<AFEX_RIH_BASEInfo> AFEX_RIH_BASEInfos);
	boolean isExist(Date rcvIl, BigDecimal seqNo);
}