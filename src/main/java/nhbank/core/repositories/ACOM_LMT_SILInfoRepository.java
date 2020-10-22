package nhbank.core.repositories;

import nhbank.core.domain.ACOM_LMT_SILInfo;
import nhbank.core.domain.ACOM_LMT_SILInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACOM_LMT_SILInfoRepository extends JpaRepository<ACOM_LMT_SILInfo, ACOM_LMT_SILInfo_ID> {
    boolean existsBySngNoAndActCdAndSilCcy(String sngNo, String actCd, String silCcy);

}