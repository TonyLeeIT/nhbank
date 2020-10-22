package nhbank.core.services;

import nhbank.core.domain.AFEX_IPH_COVERInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPH_COVERInfoService {
    void updateAll();

    void insertAll(List<AFEX_IPH_COVERInfo> objList);

    boolean isExist(String refNo, BigDecimal seq);

}