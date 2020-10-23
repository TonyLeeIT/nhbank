package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_ACTCDInfo;

import java.util.List;

public interface ACOM_COM_ACTCDInfoService {
    void updateAll();

    void insertAll(List<ACOM_COM_ACTCDInfo> objList);

    boolean isExist(String brNo, String bsplGb, String acCd);

}