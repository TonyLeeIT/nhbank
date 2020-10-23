package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPB_DJHInfo;
import nhbank.core.domain.AFEX_IPB_DJHInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPB_DJHInfoRepository extends JpaRepository<AFEX_IPB_DJHInfo, AFEX_IPB_DJHInfo_ID> {
    boolean existsByRefNoAndSeqAndSseq(String refNo, BigDecimal seq, BigDecimal sseq);

}