package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_BDSInfo;
import nhbank.core.domain.AFEX_XPB_BDSInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPB_BDSInfoRepository extends JpaRepository<AFEX_XPB_BDSInfo, AFEX_XPB_BDSInfo_ID> {
    boolean existsByRefNoAndHisNoAndBudoSeq(String refNo, BigDecimal hisNo, BigDecimal budoSeq);

}