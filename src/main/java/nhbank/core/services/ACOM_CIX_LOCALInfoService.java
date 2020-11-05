package nhbank.core.services;

import nhbank.core.domain.ACOM_CIX_LOCALInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_CIX_LOCALInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_CIX_LOCALInfo> objList);

    boolean isExist(String cixNo, String itemNm);

}