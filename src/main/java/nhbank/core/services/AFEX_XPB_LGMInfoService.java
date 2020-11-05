package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_LGMInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPB_LGMInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPB_LGMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}