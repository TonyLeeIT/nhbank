package nhbank.core.services;

import nhbank.core.domain.AFEX_XPB_ADVInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AFEX_XPB_ADVInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_XPB_ADVInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}