package nhbank.core.services;
import nhbank.core.domain.AFEX_IPH_BTAGInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_IPH_BTAGInfoService {
	void updateAll();
	void insertAll(List<AFEX_IPH_BTAGInfo> AFEX_IPH_BTAGInfos);
	boolean isExist(String refNo, String tagCd, BigDecimal seq);
}