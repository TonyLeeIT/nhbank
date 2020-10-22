package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RIH_BASEInfo;
import nhbank.core.domain.AFEX_RIH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_RIH_BASEInfoRepository extends JpaRepository<AFEX_RIH_BASEInfo, AFEX_RIH_BASEInfo_ID> {
    boolean existsByRcvIlAndSeqNo(Date rcvIl, BigDecimal seqNo);

}