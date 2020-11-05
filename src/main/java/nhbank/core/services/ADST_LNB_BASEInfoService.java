package nhbank.core.services;

import nhbank.core.domain.ADST_LNB_BASEInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ADST_LNB_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ADST_LNB_BASEInfo> objList);

    boolean isExist(String refNo);

}