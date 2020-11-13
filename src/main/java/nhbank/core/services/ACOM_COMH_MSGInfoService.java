package nhbank.core.services;

import nhbank.core.domain.ACOM_COMH_MSGInfo;

import java.io.IOException;
import java.util.List;

public interface ACOM_COMH_MSGInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COMH_MSGInfo> objList);

    boolean isExist(String docId);

}