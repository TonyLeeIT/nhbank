package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RCH_TRANInfo;
import nhbank.core.domain.AFEX_RCH_TRANInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_RCH_TRANInfoRepository extends JpaRepository<AFEX_RCH_TRANInfo, AFEX_RCH_TRANInfo_ID> {
    boolean existsByCdAndCcyAndMtGbAndTrIlAndTrSeq(String cd, String ccy, String mtGb, Date trIl, BigDecimal trSeq);

}