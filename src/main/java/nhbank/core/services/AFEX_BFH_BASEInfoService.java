package nhbank.core.services;

import nhbank.core.domain.AFEX_BFH_BASEInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFEX_BFH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_BFH_BASEInfo> objList);

    boolean isExist(Date recvIl, BigDecimal seqNo);

}