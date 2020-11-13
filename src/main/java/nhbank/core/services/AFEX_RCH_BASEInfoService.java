package nhbank.core.services;

import nhbank.core.domain.AFEX_RCH_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface AFEX_RCH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_RCH_BASEInfo> objList);

    boolean isExist(String cd, String bkcd);

}