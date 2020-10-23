package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_BASEInfo;

import java.util.List;

public interface AFEX_XPB_BASEInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPB_BASEInfo> objList);

    boolean isExist(String refNo);

}