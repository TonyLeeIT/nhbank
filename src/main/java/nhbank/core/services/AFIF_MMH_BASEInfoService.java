package nhbank.core.services;

import nhbank.core.domain.AFIF_MMH_BASEInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AFIF_MMH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFIF_MMH_BASEInfo> objList);

    boolean isExist(String refNo);

}