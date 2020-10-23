package nhbank.core.services;

import nhbank.core.domain.AFEX_RIH_HISInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_RIH_HISInfoService {
    void updateAll();

    void insertAll(List<AFEX_RIH_HISInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}