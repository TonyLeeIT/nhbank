package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPB_BASEInfo;
import nhbank.core.domain.AFEX_IPB_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_IPB_BASEInfoRepository extends JpaRepository<AFEX_IPB_BASEInfo, AFEX_IPB_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}