package nhbank.core.services;

import nhbank.core.domain.AFIF_FEH_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface AFIF_FEH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFIF_FEH_BASEInfo> objList);

    boolean isExist(String refNo);

}