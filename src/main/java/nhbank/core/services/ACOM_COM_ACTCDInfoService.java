package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_ACTCDInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_COM_ACTCDInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COM_ACTCDInfo> objList);

    boolean isExist(String brNo, String bsplGb, String acCd);

}