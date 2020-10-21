package nhbank.core.services;
import nhbank.core.domain.AFEX_XPB_RENEDTInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_XPB_RENEDTInfoService {
	void updateAll();
	void insertAll(List<AFEX_XPB_RENEDTInfo> AFEX_XPB_RENEDTInfos);
	boolean isExist(Date mngIl, String refNo);
}