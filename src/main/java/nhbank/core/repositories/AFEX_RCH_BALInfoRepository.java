package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RCH_BALInfo;
import nhbank.core.domain.AFEX_RCH_BALInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AFEX_RCH_BALInfoRepository extends JpaRepository<AFEX_RCH_BALInfo, AFEX_RCH_BALInfo_ID> {
    boolean existsByCdAndCcyAndTrIl(String cd, String ccy, Date trIl);

}