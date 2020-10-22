package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_BDMInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPB_BDMInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPB_BDMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}