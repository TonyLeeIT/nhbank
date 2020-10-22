package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_GYULInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ADST_DPB_GYULInfoService {
    void updateAll();

    void insertAll(List<ADST_DPB_GYULInfo> objList);

    boolean isExist(Date ibIl, String yede, String acctNo);

}