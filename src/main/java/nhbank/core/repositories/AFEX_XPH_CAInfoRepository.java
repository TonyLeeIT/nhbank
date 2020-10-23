package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPH_CAInfo;
import nhbank.core.domain.AFEX_XPH_CAInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface AFEX_XPH_CAInfoRepository extends JpaRepository<AFEX_XPH_CAInfo, AFEX_XPH_CAInfo_ID> {
    boolean existsByRcvIlAndSeqNo(Date rcvIl, BigDecimal seqNo);

}