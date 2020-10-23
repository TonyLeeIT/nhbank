package nhbank.core.repositories;

import nhbank.core.domain.AFIF_MTH_BASEInfo;
import nhbank.core.domain.AFIF_MTH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFIF_MTH_BASEInfoRepository extends JpaRepository<AFIF_MTH_BASEInfo, AFIF_MTH_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}