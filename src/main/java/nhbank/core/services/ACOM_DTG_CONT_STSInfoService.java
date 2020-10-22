package nhbank.core.services;

import nhbank.core.domain.ACOM_DTG_CONT_STSInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_DTG_CONT_STSInfoService {
    void updateAll();

    void insertAll(List<ACOM_DTG_CONT_STSInfo> objList);

    boolean isExist(String refNo, BigDecimal seqNo, String brNo);

}