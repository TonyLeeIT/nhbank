package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_SHIP_RESENDInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPH_SHIP_RESENDInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPH_SHIP_RESENDInfo> objList);

    boolean isExist(String refNo, BigDecimal bhSeq, BigDecimal seq);

}