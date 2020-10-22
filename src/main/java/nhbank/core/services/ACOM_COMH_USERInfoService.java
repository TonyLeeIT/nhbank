package nhbank.core.services;

import nhbank.core.domain.ACOM_COMH_USERInfo;

import java.util.List;

public interface ACOM_COMH_USERInfoService {
    void updateAll();

    void insertAll(List<ACOM_COMH_USERInfo> objList);

    boolean isExist(String opNo);

}