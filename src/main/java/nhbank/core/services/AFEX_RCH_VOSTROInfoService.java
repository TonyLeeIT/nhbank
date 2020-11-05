package nhbank.core.services;

import nhbank.core.domain.AFEX_RCH_VOSTROInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_RCH_VOSTROInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_RCH_VOSTROInfo> objList);

    boolean isExist(Date ibIl, BigDecimal seqNo, BigDecimal hisNo, BigDecimal cdAmt);

}