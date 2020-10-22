package nhbank.core.services;

import nhbank.core.domain.ADST_LNB_REPAYInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ADST_LNB_REPAYInfoService {
    void updateAll();

    void insertAll(List<ADST_LNB_REPAYInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, BigDecimal seqNo);

}