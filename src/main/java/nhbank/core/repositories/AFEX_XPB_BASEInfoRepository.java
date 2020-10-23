package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_BASEInfo;
import nhbank.core.domain.AFEX_XPB_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_XPB_BASEInfoRepository extends JpaRepository<AFEX_XPB_BASEInfo, AFEX_XPB_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}