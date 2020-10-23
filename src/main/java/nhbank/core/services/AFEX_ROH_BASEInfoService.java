package nhbank.core.services;

import nhbank.core.domain.AFEX_ROH_BASEInfo;

import java.util.List;

public interface AFEX_ROH_BASEInfoService {
    void updateAll();

    void insertAll(List<AFEX_ROH_BASEInfo> objList);

    boolean isExist(String refNo);

}