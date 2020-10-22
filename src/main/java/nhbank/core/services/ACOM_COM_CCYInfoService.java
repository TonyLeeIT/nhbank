package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_CCYInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_COM_CCYInfoService {
    void updateAll();

    void insertAll(List<ACOM_COM_CCYInfo> objList);

    boolean isExist(String cd);

}