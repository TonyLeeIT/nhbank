package nhbank.core.repositories;

import nhbank.core.domain.ACOM_FAB_ITMInfo;
import nhbank.core.domain.ACOM_FAB_ITMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_FAB_ITMInfoRepository extends JpaRepository<ACOM_FAB_ITMInfo, ACOM_FAB_ITMInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}