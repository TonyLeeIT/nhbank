package nhbank.core.services;

import nhbank.core.domain.ACOM_CIX_BASEInfo;

import java.util.List;

public interface ACOM_CIX_BASEInfoService {
    void updateAll();

    void insertAll(List<ACOM_CIX_BASEInfo> objList);

    boolean isExist(String cixNo);

}