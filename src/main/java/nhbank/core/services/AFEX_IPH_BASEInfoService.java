package nhbank.core.services;

import nhbank.core.domain.AFEX_IPH_BASEInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPH_BASEInfoService {
    void updateAll();

    void insertAll(List<AFEX_IPH_BASEInfo> objList);

    boolean isExist(String refNo);

}