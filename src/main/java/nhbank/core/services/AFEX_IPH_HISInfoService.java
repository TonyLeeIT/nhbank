package nhbank.core.services;

import nhbank.core.domain.AFEX_IPH_HISInfo;

import java.math.BigDecimal;
import java.util.List;

public interface AFEX_IPH_HISInfoService {
    void updateAll();

    void insertAll(List<AFEX_IPH_HISInfo> objList);

    boolean isExist(String refNo, BigDecimal seqNo);

}