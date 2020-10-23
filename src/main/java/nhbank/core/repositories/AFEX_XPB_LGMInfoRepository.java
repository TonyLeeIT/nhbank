package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_LGMInfo;
import nhbank.core.domain.AFEX_XPB_LGMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPB_LGMInfoRepository extends JpaRepository<AFEX_XPB_LGMInfo, AFEX_XPB_LGMInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}