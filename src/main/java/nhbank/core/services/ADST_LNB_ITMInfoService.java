package nhbank.core.services;

import nhbank.core.domain.ADST_LNB_ITMInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ADST_LNB_ITMInfoService {
    void updateAll();

    void insertAll(List<ADST_LNB_ITMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}