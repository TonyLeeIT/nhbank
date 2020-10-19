package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import nhbank.core.repositories.ACOM_LMT_BASEHISInfoRepo;
import nhbank.core.services.ACOM_LMT_BASEHISInfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ACOM_LMT_BASEHISInfoServiceImpl implements ACOM_LMT_BASEHISInfoService {

    @Autowired
    ACOM_LMT_BASEHISInfoRepo acom_lmt_basehisInfoRepo;
    @Override
<<<<<<< HEAD
    public void updateTable(Iterable<ACOM_LMT_BASEHISInfo> acom_lmt_basehisInfo) {
        repos.saveAll(acom_lmt_basehisInfo);
=======
    public void saveAll(List<ACOM_LMT_BASEHISInfo> acom_lmt_basehisInfoList) {
        acom_lmt_basehisInfoRepo.saveAll(acom_lmt_basehisInfoList);
>>>>>>> nam
    }

    @Override
    public void save(ACOM_LMT_BASEHISInfo acom_lmt_basehisInfo) {
        acom_lmt_basehisInfoRepo.save(acom_lmt_basehisInfo);
    }
//    public static final Logger logger = LoggerFactory.getLogger(ACOM_LMT_BASEHISInfoServiceImpl.class);
//

//
//    @Override
//    public void updateTable(List<ACOM_LMT_BASEHISInfo> acom_lmt_basehisInfo) {
//        repos.saveAll(acom_lmt_basehisInfo);
//    }
//
//    @Override
//    public void insertTable(ACOM_LMT_BASEHISInfo acom_lmt_basehisInfo) {
//        repos.save(acom_lmt_basehisInfo);
//    }
//
//    @Override
//    public boolean isExistTable(ACOM_LMT_BASEHISInfo acom_lmt_basehisInfo) {
//        return repos.existsBySngNo(acom_lmt_basehisInfo.getSngNo());
//    }
}
