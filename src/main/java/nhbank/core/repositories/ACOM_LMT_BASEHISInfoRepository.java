package nhbank.core.repositories;


import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import nhbank.core.domain.ACOM_LMT_BASEHISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ACOM_LMT_BASEHISInfoRepository extends JpaRepository<ACOM_LMT_BASEHISInfo, ACOM_LMT_BASEHISInfo_ID> {
    boolean existsBySngNoAndActCdAndHisNoAndHisGb(String sngNo, String actCd, BigDecimal hisNo, String hisGb);

    List<ACOM_LMT_BASEHISInfo> findAllBySngNo(String sngNob);
}
