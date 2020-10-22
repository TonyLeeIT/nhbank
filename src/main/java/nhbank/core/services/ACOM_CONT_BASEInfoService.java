package nhbank.core.services;

import nhbank.core.domain.ACOM_CONT_BASEInfo;

import java.util.List;

public interface ACOM_CONT_BASEInfoService {
    void updateAll();

    void insertAll(List<ACOM_CONT_BASEInfo> objList);

    boolean isExist(String refNo, String cntyCd, String rgnCd);

}