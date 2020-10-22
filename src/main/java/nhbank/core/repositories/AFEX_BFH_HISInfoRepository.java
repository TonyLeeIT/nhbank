package nhbank.core.repositories;

import nhbank.core.domain.AFEX_BFH_HISInfo;
import nhbank.core.domain.AFEX_BFH_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_BFH_HISInfoRepository extends JpaRepository<AFEX_BFH_HISInfo, AFEX_BFH_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}