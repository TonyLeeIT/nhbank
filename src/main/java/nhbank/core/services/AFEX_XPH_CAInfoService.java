package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_CAInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPH_CAInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPH_CAInfo> objList);

    boolean isExist(Date rcvIl, BigDecimal seqNo);

}