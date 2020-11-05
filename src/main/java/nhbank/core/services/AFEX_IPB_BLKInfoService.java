package nhbank.core.services;

import nhbank.core.domain.AFEX_IPB_BLKInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPB_BLKInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_IPB_BLKInfo> objList);

    boolean isExist(String refNo, BigDecimal seq, BigDecimal sseq);

}