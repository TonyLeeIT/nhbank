package nhbank.core.services;

import nhbank.core.domain.AFEX_BFH_PAYInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_BFH_PAYInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_BFH_PAYInfo> objList);

    boolean isExist(String refNo, BigDecimal payCnt);

}