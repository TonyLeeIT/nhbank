package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_HISInfo;
import nhbank.core.domain.AFEX_XPB_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPB_HISInfoRepository extends JpaRepository<AFEX_XPB_HISInfo, AFEX_XPB_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}