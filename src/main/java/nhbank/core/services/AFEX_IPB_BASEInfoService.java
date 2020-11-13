package nhbank.core.services;

import nhbank.core.domain.AFEX_IPB_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface AFEX_IPB_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_IPB_BASEInfo> objList);

    boolean isExist(String refNo);

}