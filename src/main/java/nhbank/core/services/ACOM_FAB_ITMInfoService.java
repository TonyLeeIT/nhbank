package nhbank.core.services;

import nhbank.core.domain.ACOM_FAB_ITMInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ACOM_FAB_ITMInfoService {
    void updateAll();

    void insertAll(List<ACOM_FAB_ITMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}