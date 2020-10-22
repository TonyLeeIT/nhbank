package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_ITMInfo;
import nhbank.core.domain.AFEX_XPB_ITMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_XPB_ITMInfoRepository extends JpaRepository<AFEX_XPB_ITMInfo, AFEX_XPB_ITMInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}