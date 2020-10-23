package nhbank.core.services;

import nhbank.core.domain.ACOM_DMH_HISInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ACOM_DMH_HISInfoService {
    void updateAll();

    void insertAll(List<ACOM_DMH_HISInfo> objList);

    boolean isExist(String cixNo, String damboNo, BigDecimal hisNo, String sts);

}