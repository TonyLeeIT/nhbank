package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_FPHEADInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface ACOM_COM_FPHEADInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COM_FPHEADInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, String prtKind);

}