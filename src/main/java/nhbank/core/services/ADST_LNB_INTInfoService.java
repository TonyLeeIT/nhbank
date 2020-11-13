package nhbank.core.services;

import nhbank.core.domain.ADST_LNB_INTInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface ADST_LNB_INTInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ADST_LNB_INTInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, BigDecimal seqNo);

}