package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_SILHISInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ACOM_LMT_SILHISInfoService {
    void updateAll();

    void insertAll(List<ACOM_LMT_SILHISInfo> objList);

    boolean isExist(String sngNo, String actCd, String silCcy, BigDecimal hisNo);

}