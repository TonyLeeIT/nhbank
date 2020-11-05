package nhbank.core.services;

import nhbank.core.domain.ACOM_COMH_MSGHISInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_COMH_MSGHISInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COMH_MSGHISInfo> objList);

    boolean isExist(String docId, BigDecimal seqNo);

}