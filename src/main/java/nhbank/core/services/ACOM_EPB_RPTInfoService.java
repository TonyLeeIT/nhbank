package nhbank.core.services;

import nhbank.core.domain.ACOM_EPB_RPTInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_EPB_RPTInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_EPB_RPTInfo> objList);

}