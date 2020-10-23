package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_INFOInfo;

import java.util.List;

public interface ADST_DPB_INFOInfoService {
    void updateAll();

    void insertAll(List<ADST_DPB_INFOInfo> objList);

    boolean isExist(String acctNo);

}