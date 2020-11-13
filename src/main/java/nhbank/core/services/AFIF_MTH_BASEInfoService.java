package nhbank.core.services;

import nhbank.core.domain.AFIF_MTH_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface AFIF_MTH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFIF_MTH_BASEInfo> objList);

    boolean isExist(String refNo);

}