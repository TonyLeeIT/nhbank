package nhbank.core.services;

import nhbank.core.domain.AFEX_ROB_AMDInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_ROB_AMDInfoService {
    void updateAll();

    void insertAll(List<AFEX_ROB_AMDInfo> objList);

    boolean isExist(String refNo, BigDecimal chgSeq, String tblGb);

}