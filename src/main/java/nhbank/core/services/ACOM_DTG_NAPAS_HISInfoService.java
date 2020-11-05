package nhbank.core.services;

import nhbank.core.domain.ACOM_DTG_NAPAS_HISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_DTG_NAPAS_HISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_DTG_NAPAS_HISInfo> objList);

    boolean isExist(String trnDate, String de032AcqCd, String de041CrdAcptTrm, String de011TraceNo, BigDecimal hisNo);

}