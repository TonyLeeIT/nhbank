package nhbank.core.services;

import nhbank.core.domain.AACT_TRX_BASEInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AACT_TRX_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AACT_TRX_BASEInfo> objList);

    boolean isExist(Date trxIl, String trxBr);

}