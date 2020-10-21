package nhbank.core.services;
import nhbank.core.domain.ACOM_FAB_HISInfo;

import java.math.BigDecimal;
import java.util.List;
public interface ACOM_FAB_HISInfoService {
	void updateAll();
	void insertAll(List<ACOM_FAB_HISInfo> ACOM_FAB_HISInfos);
	boolean isExist(String refNo, BigDecimal hisNo);
}