package nhbank.core.services;

import nhbank.core.domain.ACOM_EPB_HISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_EPB_HISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_EPB_HISInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}