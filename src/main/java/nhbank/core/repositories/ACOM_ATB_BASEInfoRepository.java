package nhbank.core.repositories;

import nhbank.core.domain.ACOM_ATB_BASEInfo;
import nhbank.core.domain.ACOM_ATB_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_ATB_BASEInfoRepository extends JpaRepository<ACOM_ATB_BASEInfo, ACOM_ATB_BASEInfo_ID> {
    boolean existsByRefNo(String refNo);

}