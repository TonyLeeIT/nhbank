package nhbank.core.services;
import nhbank.core.domain.AFEX_RCH_TRANInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_RCH_TRANInfoService {
	void updateAll();
	void insertAll(List<AFEX_RCH_TRANInfo> AFEX_RCH_TRANInfos);
	boolean isExist(String cd, String ccy, String mtGb, Date trIl, BigDecimal trSeq);
}