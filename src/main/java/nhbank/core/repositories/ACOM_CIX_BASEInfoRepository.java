package nhbank.core.repositories;

import nhbank.core.domain.ACOM_CIX_BASEInfo;
import nhbank.core.domain.ACOM_CIX_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACOM_CIX_BASEInfoRepository extends JpaRepository<ACOM_CIX_BASEInfo, ACOM_CIX_BASEInfo_ID> {
    boolean existsByCixNo(String cixNo);

}