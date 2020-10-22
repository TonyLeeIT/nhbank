package nhbank.core.services;

import nhbank.core.domain.ACOM_EPB_BASEInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_EPB_BASEInfoService {
    void updateAll();

    void insertAll(List<ACOM_EPB_BASEInfo> objList);

    boolean isExist(String refNo);

}