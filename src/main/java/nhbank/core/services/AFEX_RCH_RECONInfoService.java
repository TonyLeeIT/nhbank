package nhbank.core.services;

import nhbank.core.domain.AFEX_RCH_RECONInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_RCH_RECONInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_RCH_RECONInfo> objList);

    boolean isExist(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date reconIl);

}