package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPH_TRAInfo;
import nhbank.core.domain.AFEX_XPH_TRAInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPH_TRAInfoRepository extends JpaRepository<AFEX_XPH_TRAInfo, AFEX_XPH_TRAInfo_ID> {
    boolean existsByRefNoAndTraGbAndHisNoAndSeqNo(String refNo, String traGb, BigDecimal hisNo, BigDecimal seqNo);

}