package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import nhbank.core.repositories.ACOM_LMT_BASEHISInfoRepo;
import nhbank.core.services.BackupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ACOM_LMT_BASEHISInfoServiceImpl implements BackupService<ACOM_LMT_BASEHISInfo> {
    public static final Logger logger = LoggerFactory.getLogger(ACOM_LMT_BASEHISInfoServiceImpl.class);

    @Autowired
    ACOM_LMT_BASEHISInfoRepo repos;

    @Override
    public void updateTable(List<ACOM_LMT_BASEHISInfo> acom_lmt_basehisInfo) {
        repos.saveAll(acom_lmt_basehisInfo);
    }

    @Override
    public void insertTable(ACOM_LMT_BASEHISInfo acom_lmt_basehisInfo) {
        repos.save(acom_lmt_basehisInfo);
    }

    @Override
    public boolean isExistTable(ACOM_LMT_BASEHISInfo acom_lmt_basehisInfo) {
        return repos.existsBySngNo(acom_lmt_basehisInfo.getSngNo());
    }
}
