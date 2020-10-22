package nhbank.core.services;

import nhbank.core.domain.AFEX_ADH_HISInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_ADH_HISInfoService {
    void updateAll();

    void insertAll(List<AFEX_ADH_HISInfo> objList);

    boolean isExist(String advNo, BigDecimal hisNo);

}