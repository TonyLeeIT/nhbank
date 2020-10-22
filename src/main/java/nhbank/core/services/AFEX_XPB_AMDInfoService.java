package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_AMDInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPB_AMDInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPB_AMDInfo> objList);

    boolean isExist(String refNo, BigDecimal seqNo);

}