package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_ADVInfo;
import nhbank.core.domain.AFEX_XPB_ADVInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPB_ADVInfoRepository extends JpaRepository<AFEX_XPB_ADVInfo, AFEX_XPB_ADVInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}