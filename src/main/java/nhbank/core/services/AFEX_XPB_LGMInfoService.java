package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_LGMInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPB_LGMInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPB_LGMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}