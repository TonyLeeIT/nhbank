package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_BDSInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPB_BDSInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPB_BDSInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, BigDecimal budoSeq);

}