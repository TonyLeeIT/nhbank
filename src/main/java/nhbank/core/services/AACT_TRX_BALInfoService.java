package nhbank.core.services;

import nhbank.core.domain.AACT_TRX_BALInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AACT_TRX_BALInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AACT_TRX_BALInfo> objList);

    boolean isExist(String refNo, String balDvCd, String dtlsBalDvCd, String ifrsDvCd, String atitCd, String ccy, Date apclStrDt, Date apclEndDt);

}