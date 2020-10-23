package nhbank.core.services;

import nhbank.core.domain.AFIF_MMH_BASEInfo;

import java.util.List;

public interface AFIF_MMH_BASEInfoService {
    void updateAll();

    void insertAll(List<AFIF_MMH_BASEInfo> objList);

    boolean isExist(String refNo);

}