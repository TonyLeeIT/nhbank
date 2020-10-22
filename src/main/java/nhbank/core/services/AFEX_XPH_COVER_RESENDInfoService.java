package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_COVER_RESENDInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPH_COVER_RESENDInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPH_COVER_RESENDInfo> objList);

    boolean isExist(String refNo, BigDecimal bhSeq);

}