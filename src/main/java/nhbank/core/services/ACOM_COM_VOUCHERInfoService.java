package nhbank.core.services;

import nhbank.core.domain.ACOM_COM_VOUCHERInfo;

import java.io.IOException;
import java.util.List;

public interface ACOM_COM_VOUCHERInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ACOM_COM_VOUCHERInfo> objList);

    boolean isExist(String acIl, String acBr);

}