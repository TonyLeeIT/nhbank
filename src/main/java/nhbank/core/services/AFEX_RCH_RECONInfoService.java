package nhbank.core.services;
import nhbank.core.domain.AFEX_RCH_RECONInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RCH_RECONInfoService {
	void updateAll();
	void insertAll(List<AFEX_RCH_RECONInfo> AFEX_RCH_RECONInfos);
	boolean isExist(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date reconIl);
}