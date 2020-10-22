package nhbank.core.services;

import nhbank.core.domain.AACT_TRX_PLInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AACT_TRX_PLInfoService {
    void updateAll();

    void insertAll(List<AACT_TRX_PLInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, BigDecimal segSeq);

}