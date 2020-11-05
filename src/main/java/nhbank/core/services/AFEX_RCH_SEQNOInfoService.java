package nhbank.core.services;

import nhbank.core.domain.AFEX_RCH_SEQNOInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_RCH_SEQNOInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_RCH_SEQNOInfo> objList);

    boolean isExist(Date trIl, String saGb, String cd, String ccy);

}