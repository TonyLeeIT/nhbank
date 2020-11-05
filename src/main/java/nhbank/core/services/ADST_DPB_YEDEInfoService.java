package nhbank.core.services;

import nhbank.core.domain.ADST_DPB_YEDEInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ADST_DPB_YEDEInfoService {
    void updateAll() throws IOException;

    void insertAll(List<ADST_DPB_YEDEInfo> objList);

    boolean isExist(String acctNo, String modeGb);

}