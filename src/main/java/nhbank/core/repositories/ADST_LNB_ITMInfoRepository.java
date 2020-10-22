package nhbank.core.repositories;

import nhbank.core.domain.ADST_LNB_ITMInfo;
import nhbank.core.domain.ADST_LNB_ITMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ADST_LNB_ITMInfoRepository extends JpaRepository<ADST_LNB_ITMInfo, ADST_LNB_ITMInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}