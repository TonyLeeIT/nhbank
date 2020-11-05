package nhbank.core.services;

import nhbank.core.domain.AFEX_IPB_DJHInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPB_DJHInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_IPB_DJHInfo> objList);

    boolean isExist(String refNo, BigDecimal seq, BigDecimal sseq);

}