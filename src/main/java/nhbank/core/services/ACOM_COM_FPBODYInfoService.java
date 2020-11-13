package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_FPBODYInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface ACOM_COM_FPBODYInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COM_FPBODYInfo> objList);

    boolean isExist(String refNo, BigDecimal hisNo, String prtKind, BigDecimal lineSeq);

}