package nhbank.core.services;

import nhbank.core.domain.AFEX_ROH_HISInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_ROH_HISInfoService {
    void updateAll();

    void insertAll(List<AFEX_ROH_HISInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}