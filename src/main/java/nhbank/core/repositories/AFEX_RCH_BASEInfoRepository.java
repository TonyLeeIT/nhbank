package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RCH_BASEInfo;
import nhbank.core.domain.AFEX_RCH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_RCH_BASEInfoRepository extends JpaRepository<AFEX_RCH_BASEInfo, AFEX_RCH_BASEInfo_ID> {
    boolean existsByCdAndBkcd(String cd, String bkcd);

}