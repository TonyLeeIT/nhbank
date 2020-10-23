package nhbank.core.services;

import nhbank.core.domain.ADST_LNB_FEEInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ADST_LNB_FEEInfoService {
    void updateAll();

    void insertAll(List<ADST_LNB_FEEInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, BigDecimal seqNo);

}