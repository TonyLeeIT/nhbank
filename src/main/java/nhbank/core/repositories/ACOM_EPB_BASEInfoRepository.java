package nhbank.core.repositories;

import nhbank.core.domain.ACOM_EPB_BASEInfo;
import nhbank.core.domain.ACOM_EPB_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACOM_EPB_BASEInfoRepository extends JpaRepository<ACOM_EPB_BASEInfo, ACOM_EPB_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}