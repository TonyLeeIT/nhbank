package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_CERTInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ADST_DPB_CERTInfoService {
    void updateAll();

    void insertAll(List<ADST_DPB_CERTInfo> objList);

    boolean isExist(String acctNo, Date ibIl);

}