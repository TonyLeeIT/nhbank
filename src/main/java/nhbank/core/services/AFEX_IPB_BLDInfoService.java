package nhbank.core.services;

import nhbank.core.domain.AFEX_IPB_BLDInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AFEX_IPB_BLDInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_IPB_BLDInfo> objList);

    boolean isExist(String refNo, BigDecimal seq);

}