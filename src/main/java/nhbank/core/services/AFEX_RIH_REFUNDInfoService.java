package nhbank.core.services;

import nhbank.core.domain.AFEX_RIH_REFUNDInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_RIH_REFUNDInfoService {
    void updateAll();

    void insertAll(List<AFEX_RIH_REFUNDInfo> objList);

    boolean isExist(String refNo, BigDecimal seqNo);

}