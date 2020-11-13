package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_INFOInfo;

import java.io.IOException;
import java.util.List;

public interface ADST_DPB_INFOInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ADST_DPB_INFOInfo> objList);

    boolean isExist(String acctNo);

}