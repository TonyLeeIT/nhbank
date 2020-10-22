package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPH_AMDInfo;
import nhbank.core.domain.AFEX_IPH_AMDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_IPH_AMDInfoRepository extends JpaRepository<AFEX_IPH_AMDInfo, AFEX_IPH_AMDInfo_ID> {
    boolean existsByRefNoAndAmdSeq(String refNo, String amdSeq);

}