package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_ALLOWInfo;

import java.io.IOException;
import java.util.List;

public interface ACOM_COM_ALLOWInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COM_ALLOWInfo> objList);

    boolean isExist(String refNo);

}