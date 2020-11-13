package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_CERTInfo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface ADST_DPB_CERTInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ADST_DPB_CERTInfo> objList);

    boolean isExist(String acctNo, Date ibIl);

}