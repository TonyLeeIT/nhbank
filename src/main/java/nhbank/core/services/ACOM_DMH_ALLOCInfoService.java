package nhbank.core.services;

import nhbank.core.domain.ACOM_DMH_ALLOCInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_DMH_ALLOCInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_DMH_ALLOCInfo> objList);

    boolean isExist(String damboNo, String cixNo, String sngNo, BigDecimal seqNo);

}