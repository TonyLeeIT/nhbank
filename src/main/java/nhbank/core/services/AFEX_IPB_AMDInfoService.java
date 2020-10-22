package nhbank.core.services;

import nhbank.core.domain.AFEX_IPB_AMDInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPB_AMDInfoService {
    void updateAll();

    void insertAll(List<AFEX_IPB_AMDInfo> objList);

    boolean isExist(String refNo, BigDecimal seq);

}