package nhbank.core.services;

import nhbank.core.domain.AFEX_IPH_AMDInfo;

import java.util.List;

public interface AFEX_IPH_AMDInfoService {
    void updateAll();

    void insertAll(List<AFEX_IPH_AMDInfo> objList);

    boolean isExist(String refNo, String amdSeq);

}