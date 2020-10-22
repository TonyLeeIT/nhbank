package nhbank.core.services;

import nhbank.core.domain.AFEX_ADH_AMENDInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_ADH_AMENDInfoService {
    void updateAll();

    void insertAll(List<AFEX_ADH_AMENDInfo> objList);

    boolean isExist(Date makeIl, BigDecimal seqNo);

}