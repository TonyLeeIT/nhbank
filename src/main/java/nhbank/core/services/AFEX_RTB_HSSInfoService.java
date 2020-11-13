package nhbank.core.services;

import nhbank.core.domain.AFEX_RTB_HSSInfo;

import java.io.IOException;
import java.util.List;

public interface AFEX_RTB_HSSInfoService {
    void updateAll() throws IOException;

    void insertAll(List<AFEX_RTB_HSSInfo> objList);

    boolean isExist(String refNo);

}