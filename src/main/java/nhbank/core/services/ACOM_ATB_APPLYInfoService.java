package nhbank.core.services;

import nhbank.core.domain.ACOM_ATB_APPLYInfo;

import java.util.List;

public interface ACOM_ATB_APPLYInfoService {
    void updateAll();

    void insertAll(List<ACOM_ATB_APPLYInfo> objList);

    boolean isExist(String applyNo);

}