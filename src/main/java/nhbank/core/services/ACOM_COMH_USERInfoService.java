package nhbank.core.services;

import nhbank.core.domain.ACOM_COMH_USERInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_COMH_USERInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COMH_USERInfo> objList);

    boolean isExist(String opNo);

}