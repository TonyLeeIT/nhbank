package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPB_LGMInfo;
import nhbank.core.domain.AFEX_IPB_LGMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPB_LGMInfoRepository extends JpaRepository<AFEX_IPB_LGMInfo, AFEX_IPB_LGMInfo_ID> {
    boolean existsByRefNoAndSeqAndSseq(String refNo, BigDecimal seq, BigDecimal sseq);

}