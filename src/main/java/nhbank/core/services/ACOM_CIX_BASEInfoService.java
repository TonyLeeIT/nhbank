package nhbank.core.services;

import nhbank.core.domain.ACOM_CIX_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface ACOM_CIX_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_CIX_BASEInfo> objList);

    boolean isExist(String cixNo);

}