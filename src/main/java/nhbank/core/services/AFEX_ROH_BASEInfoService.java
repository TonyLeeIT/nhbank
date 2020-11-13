package nhbank.core.services;

import nhbank.core.domain.AFEX_ROH_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface AFEX_ROH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_ROH_BASEInfo> objList);

    boolean isExist(String refNo);

}