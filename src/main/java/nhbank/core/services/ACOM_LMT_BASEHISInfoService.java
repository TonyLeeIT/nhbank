package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import nhbank.core.domain.ACOM_LMT_BASEHISInfo_ID;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ACOM_LMT_BASEHISInfoService {
    void updateAll();

    void insertAll(List<ACOM_LMT_BASEHISInfo> objList);

    boolean isExist(String sngNo, String actCd, BigDecimal hisNo, String hisGb);

    List<ACOM_LMT_BASEHISInfo> findAll();

    List<ACOM_LMT_BASEHISInfo> findBySngNo(String sngNo);
}
