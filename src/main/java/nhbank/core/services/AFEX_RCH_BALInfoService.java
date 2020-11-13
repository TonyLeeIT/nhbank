package nhbank.core.services;

import nhbank.core.domain.AFEX_RCH_BALInfo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface AFEX_RCH_BALInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_RCH_BALInfo> objList);

    boolean isExist(String cd, String ccy, Date trIl);

}