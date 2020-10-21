package nhbank.core.services;
import nhbank.core.domain.AFEX_ADH_BASEInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_ADH_BASEInfoService {
	void updateAll();
	void insertAll(List<AFEX_ADH_BASEInfo> AFEX_ADH_BASEInfos);
	boolean isExist(Date makeIl, BigDecimal seqNo);
}