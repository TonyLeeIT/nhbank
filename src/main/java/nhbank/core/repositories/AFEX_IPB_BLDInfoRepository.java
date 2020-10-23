package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPB_BLDInfo;
import nhbank.core.domain.AFEX_IPB_BLDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPB_BLDInfoRepository extends JpaRepository<AFEX_IPB_BLDInfo, AFEX_IPB_BLDInfo_ID> {
    boolean existsByRefNoAndSeq(String refNo, BigDecimal seq);

}