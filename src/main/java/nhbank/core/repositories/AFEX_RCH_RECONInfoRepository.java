package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RCH_RECONInfo;
import nhbank.core.domain.AFEX_RCH_RECONInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface AFEX_RCH_RECONInfoRepository extends JpaRepository<AFEX_RCH_RECONInfo, AFEX_RCH_RECONInfo_ID> {
    boolean existsByCdAndCcyAndSaGbAndTrIlAndTrSeqAndReconIl(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date reconIl);

}