package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RCH_VOSTROInfo;
import nhbank.core.domain.AFEX_RCH_VOSTROInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface AFEX_RCH_VOSTROInfoRepository extends JpaRepository<AFEX_RCH_VOSTROInfo, AFEX_RCH_VOSTROInfo_ID> {
    boolean existsByIbIlAndSeqNoAndHisNoAndCdAmt(Date ibIl, BigDecimal seqNo, BigDecimal hisNo, BigDecimal cdAmt);

}