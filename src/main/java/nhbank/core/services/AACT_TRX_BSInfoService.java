package nhbank.core.services;

import nhbank.core.domain.AACT_TRX_BSInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AACT_TRX_BSInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AACT_TRX_BSInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, BigDecimal segSeq);

}