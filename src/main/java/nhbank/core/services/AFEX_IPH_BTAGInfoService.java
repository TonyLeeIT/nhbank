package nhbank.core.services;

import nhbank.core.domain.AFEX_IPH_BTAGInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_IPH_BTAGInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_IPH_BTAGInfo> objList);

    boolean isExist(String refNo, String tagCd, BigDecimal seq);

}