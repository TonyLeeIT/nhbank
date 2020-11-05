package nhbank.core.services;

import nhbank.core.domain.ACOM_EPB_ITMInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_EPB_ITMInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_EPB_ITMInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}