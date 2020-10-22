package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_INRTInfo;

import java.util.List;

public interface ADST_DPB_INRTInfoService {
    void updateAll();

    void insertAll(List<ADST_DPB_INRTInfo> objList);


}