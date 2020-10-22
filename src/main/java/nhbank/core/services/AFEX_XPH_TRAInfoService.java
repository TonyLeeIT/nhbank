package nhbank.core.services;

import nhbank.core.domain.AFEX_XPH_TRAInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_XPH_TRAInfoService {
    void updateAll();

    void insertAll(List<AFEX_XPH_TRAInfo> objList);

    boolean isExist(String refNo, String traGb, BigDecimal hisNo, BigDecimal seqNo);

}