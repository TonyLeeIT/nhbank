package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_COVERInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPH_COVERInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPH_COVERInfo> objList);

    boolean isExist(String refNo);

}