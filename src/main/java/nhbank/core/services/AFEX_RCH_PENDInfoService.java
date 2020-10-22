package nhbank.core.services;

import nhbank.core.domain.AFEX_RCH_PENDInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_RCH_PENDInfoService {
    void updateAll();

    void insertAll(List<AFEX_RCH_PENDInfo> objList);

    boolean isExist(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date valIl);

}