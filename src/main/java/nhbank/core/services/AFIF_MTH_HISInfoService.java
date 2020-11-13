package nhbank.core.services;

import nhbank.core.domain.AFIF_MTH_HISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface AFIF_MTH_HISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFIF_MTH_HISInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo);

}