package nhbank.core.repositories;

import nhbank.core.domain.ACOM_EPB_ITMInfo;
import nhbank.core.domain.ACOM_EPB_ITMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_EPB_ITMInfoRepository extends JpaRepository<ACOM_EPB_ITMInfo, ACOM_EPB_ITMInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}