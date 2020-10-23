package nhbank.core.repositories;

import nhbank.core.domain.ACOM_LMT_CLMITInfo;
import nhbank.core.domain.ACOM_LMT_CLMITInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_LMT_CLMITInfoRepository extends JpaRepository<ACOM_LMT_CLMITInfo, ACOM_LMT_CLMITInfo_ID> {
    boolean existsByLaInspRcnoAndChgSqno(String laInspRcno, BigDecimal chgSqno);

}