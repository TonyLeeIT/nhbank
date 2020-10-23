package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RTB_BASEInfo;
import nhbank.core.domain.AFEX_RTB_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_RTB_BASEInfoRepository extends JpaRepository<AFEX_RTB_BASEInfo, AFEX_RTB_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}