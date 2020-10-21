package nhbank.core.repositories;


import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_LMT_BASEHISInfoRepo extends JpaRepository<ACOM_LMT_BASEHISInfo, String> {
    boolean existsBySngNoAndActCdAndHisNoAndHisGb(String sngNo, String actCd, BigDecimal hisNo, String hisGb);
}
