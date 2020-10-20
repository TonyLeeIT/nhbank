package nhbank.core.services;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ACOM_LMT_BASEHISInfoService {
    void saveAll(List<ACOM_LMT_BASEHISInfo> acom_lmt_basehisInfoList);

    void save(ACOM_LMT_BASEHISInfo acom_lmt_basehisInfo);
}
