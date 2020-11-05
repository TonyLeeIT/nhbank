package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_ITMInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_LMT_ITMInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_LMT_ITMInfo> objList);

    boolean isExist(String sngNo, BigDecimal seq);

}