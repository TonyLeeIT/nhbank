package nhbank.core.services;

import nhbank.core.domain.AFEX_BFH_HISInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_BFH_HISInfoService {
    void updateAll();

    void insertAll(List<AFEX_BFH_HISInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}