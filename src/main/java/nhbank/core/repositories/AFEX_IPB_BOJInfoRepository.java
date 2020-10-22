package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPB_BOJInfo;
import nhbank.core.domain.AFEX_IPB_BOJInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPB_BOJInfoRepository extends JpaRepository<AFEX_IPB_BOJInfo, AFEX_IPB_BOJInfo_ID> {
    boolean existsByRefNoAndSeq(String refNo, BigDecimal seq);

}