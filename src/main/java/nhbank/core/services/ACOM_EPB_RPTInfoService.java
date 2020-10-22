package nhbank.core.services;

import nhbank.core.domain.ACOM_EPB_RPTInfo;

import java.util.List;

public interface ACOM_EPB_RPTInfoService {
    void updateAll();

    void insertAll(List<ACOM_EPB_RPTInfo> objList);


}