package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_FEERTInfo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface ACOM_COM_FEERTInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COM_FEERTInfo> objList);

    boolean isExist(String lcd, String mcd, String scd, String mngBr, Date applyIl);

}