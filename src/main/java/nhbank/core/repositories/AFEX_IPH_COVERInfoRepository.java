package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPH_COVERInfo;
import nhbank.core.domain.AFEX_IPH_COVERInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPH_COVERInfoRepository extends JpaRepository<AFEX_IPH_COVERInfo, AFEX_IPH_COVERInfo_ID> {
    boolean existsByRefNoAndSeq(String refNo, BigDecimal seq);

}