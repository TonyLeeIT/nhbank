package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_BDMInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPB_BDMInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPB_BDMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}