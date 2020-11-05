package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_SILHISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_LMT_SILHISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_LMT_SILHISInfo> objList);

    boolean isExist(String sngNo, String actCd, String silCcy, BigDecimal hisNo);

}