package nhbank.core.services;

import nhbank.core.domain.ACOM_DMH_HISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_DMH_HISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_DMH_HISInfo> objList);

    boolean isExist(String cixNo, String damboNo, BigDecimal hisNo, String sts);

}