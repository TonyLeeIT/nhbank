package nhbank.core.repositories;

import nhbank.core.domain.ACOM_DMH_BASEInfo;
import nhbank.core.domain.ACOM_DMH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACOM_DMH_BASEInfoRepository extends JpaRepository<ACOM_DMH_BASEInfo, ACOM_DMH_BASEInfo_ID> {
    boolean existsByCixNoAndDamboNoAndSts(String cixNo, String damboNo, String sts);

}