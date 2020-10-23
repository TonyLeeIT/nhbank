package nhbank.core.repositories;

import nhbank.core.domain.AFEX_ROH_BASEInfo;
import nhbank.core.domain.AFEX_ROH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_ROH_BASEInfoRepository extends JpaRepository<AFEX_ROH_BASEInfo, AFEX_ROH_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}