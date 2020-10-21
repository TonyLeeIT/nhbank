package nhbank.core.services;
import nhbank.core.domain.AFEX_XPH_SHIP_RESENDInfo; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
public interface AFEX_XPH_SHIP_RESENDInfoService {
	void updateAll();
	void insertAll(List<AFEX_XPH_SHIP_RESENDInfo> AFEX_XPH_SHIP_RESENDInfos);
	boolean isExist(String refNo, BigDecimal bhSeq, BigDecimal seq);
}