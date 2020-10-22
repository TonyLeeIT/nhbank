package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_BDMInfo;
import nhbank.core.domain.AFEX_XPB_BDMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPB_BDMInfoRepository extends JpaRepository<AFEX_XPB_BDMInfo, AFEX_XPB_BDMInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}