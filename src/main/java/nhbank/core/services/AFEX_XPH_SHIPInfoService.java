package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_SHIPInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPH_SHIPInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPH_SHIPInfo> objList);

    boolean isExist(String refNo, BigDecimal seq);

}