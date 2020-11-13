package nhbank.core.services;

import nhbank.core.domain.ACOM_DTG_CONT_STSInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface ACOM_DTG_CONT_STSInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_DTG_CONT_STSInfo> objList);

    boolean isExist(String refNo, BigDecimal seqNo, String brNo);

}