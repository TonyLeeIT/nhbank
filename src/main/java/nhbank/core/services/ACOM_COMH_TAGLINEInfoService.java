package nhbank.core.services;

import nhbank.core.domain.ACOM_COMH_TAGLINEInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface ACOM_COMH_TAGLINEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COMH_TAGLINEInfo> objList);

    boolean isExist(String docId, BigDecimal seqNo);

}