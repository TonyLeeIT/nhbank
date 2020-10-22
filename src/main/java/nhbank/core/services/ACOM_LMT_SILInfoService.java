package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_SILInfo;

import java.util.List;

public interface ACOM_LMT_SILInfoService {
    void updateAll();

    void insertAll(List<ACOM_LMT_SILInfo> objList);

    boolean isExist(String sngNo, String actCd, String silCcy);

}