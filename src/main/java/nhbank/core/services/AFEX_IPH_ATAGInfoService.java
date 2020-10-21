package nhbank.core.services;
import nhbank.core.domain.AFEX_IPH_ATAGInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_IPH_ATAGInfoService {
	void updateAll();
	void insertAll(List<AFEX_IPH_ATAGInfo> AFEX_IPH_ATAGInfos);
	boolean isExist(String refNo, String amdSeq, String tagCd, BigDecimal seq);
}