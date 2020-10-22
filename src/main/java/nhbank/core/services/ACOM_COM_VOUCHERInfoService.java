package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_VOUCHERInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ACOM_COM_VOUCHERInfoService {
    void updateAll();

    void insertAll(List<ACOM_COM_VOUCHERInfo> objList);

    boolean isExist(String acIl, String acBr);

}