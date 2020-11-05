package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_RENEGOInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPH_RENEGOInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPH_RENEGOInfo> objList);

    boolean isExist(String refNo);

}