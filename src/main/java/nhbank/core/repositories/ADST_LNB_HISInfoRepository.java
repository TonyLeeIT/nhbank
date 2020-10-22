package nhbank.core.repositories;

import nhbank.core.domain.ADST_LNB_HISInfo;
import nhbank.core.domain.ADST_LNB_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ADST_LNB_HISInfoRepository extends JpaRepository<ADST_LNB_HISInfo, ADST_LNB_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}