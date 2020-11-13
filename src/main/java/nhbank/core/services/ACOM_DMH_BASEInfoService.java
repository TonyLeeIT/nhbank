package nhbank.core.services;

import nhbank.core.domain.ACOM_DMH_BASEInfo;

import java.io.IOException;
import java.util.List;

public interface ACOM_DMH_BASEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_DMH_BASEInfo> objList);

    boolean isExist(String cixNo, String damboNo, String sts);

}