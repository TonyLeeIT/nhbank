package nhbank.core.services;

import nhbank.core.domain.ACOM_EPB_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface ACOM_EPB_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_EPB_BASEInfo> objList);

    boolean isExist(String refNo);

}