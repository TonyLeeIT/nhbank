package nhbank.core.services;

import nhbank.core.domain.ACOM_ATB_BASEInfo;

import java.util.List;

public interface ACOM_ATB_BASEInfoService {
    void updateAll();

    void insertAll(List<ACOM_ATB_BASEInfo> objList);

    boolean isExist(String refNo);

}