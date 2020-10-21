package nhbank.core.services;
import nhbank.core.domain.ACOM_LMT_BASEHISInfo;

import java.math.BigDecimal;
import java.util.List;
public interface ACOM_LMT_BASEHISInfoService {
	void updateAll();
	void insertAll(List<ACOM_LMT_BASEHISInfo> ACOM_LMT_BASEHISInfos);
	boolean isExist(String sngNo, String actCd, BigDecimal hisNo, String hisGb);
}