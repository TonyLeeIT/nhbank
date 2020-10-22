package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_BASEHDInfo;

import java.util.List;

public interface ACOM_LMT_BASEHDInfoService {
    void updateAll();

    void insertAll(List<ACOM_LMT_BASEHDInfo> objList);

    boolean isExist(String sngNo);

}