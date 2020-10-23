package nhbank.core.services;

import nhbank.core.domain.ACOM_COMH_MSGHISInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ACOM_COMH_MSGHISInfoService {
    void updateAll();

    void insertAll(List<ACOM_COMH_MSGHISInfo> objList);

    boolean isExist(String docId, BigDecimal seqNo);

}