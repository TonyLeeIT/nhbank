package nhbank.core.repositories;

import nhbank.core.domain.AFIF_MMH_BASEInfo;
import nhbank.core.domain.AFIF_MMH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFIF_MMH_BASEInfoRepository extends JpaRepository<AFIF_MMH_BASEInfo, AFIF_MMH_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}