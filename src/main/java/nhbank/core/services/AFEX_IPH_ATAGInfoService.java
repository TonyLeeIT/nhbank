package nhbank.core.services;

import nhbank.core.domain.AFEX_IPH_ATAGInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPH_ATAGInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_IPH_ATAGInfo> objList);

    boolean isExist(String refNo, String amdSeq, String tagCd, BigDecimal seq);

}