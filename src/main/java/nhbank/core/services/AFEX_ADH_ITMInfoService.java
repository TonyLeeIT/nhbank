package nhbank.core.services;

import nhbank.core.domain.AFEX_ADH_ITMInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_ADH_ITMInfoService {
    void updateAll();

    void insertAll(List<AFEX_ADH_ITMInfo> objList);

    boolean isExist(String advNo, BigDecimal hisNo);

}