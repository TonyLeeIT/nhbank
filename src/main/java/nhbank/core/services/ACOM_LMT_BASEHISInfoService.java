package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_LMT_BASEHISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_LMT_BASEHISInfo> objList);

    boolean isExist(String sngNo, String actCd, BigDecimal hisNo, String hisGb);

}