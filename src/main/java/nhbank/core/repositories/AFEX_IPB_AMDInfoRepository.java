package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPB_AMDInfo;
import nhbank.core.domain.AFEX_IPB_AMDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPB_AMDInfoRepository extends JpaRepository<AFEX_IPB_AMDInfo, AFEX_IPB_AMDInfo_ID> {
    boolean existsByRefNoAndSeq(String refNo, BigDecimal seq);

}