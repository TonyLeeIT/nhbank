package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_BASEInfo;

import java.util.List;

public interface ADST_DPB_BASEInfoService {
    void updateAll();

    void insertAll(List<ADST_DPB_BASEInfo> objList);

    boolean isExist(String acctNo);

}