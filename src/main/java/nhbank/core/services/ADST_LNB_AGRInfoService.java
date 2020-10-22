package nhbank.core.services;

import nhbank.core.domain.ADST_LNB_AGRInfo;

import java.util.List;

public interface ADST_LNB_AGRInfoService {
    void updateAll();

    void insertAll(List<ADST_LNB_AGRInfo> objList);

    boolean isExist(String refNo);

}