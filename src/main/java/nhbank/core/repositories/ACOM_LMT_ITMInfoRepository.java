package nhbank.core.repositories;

import nhbank.core.domain.ACOM_LMT_ITMInfo;
import nhbank.core.domain.ACOM_LMT_ITMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_LMT_ITMInfoRepository extends JpaRepository<ACOM_LMT_ITMInfo, ACOM_LMT_ITMInfo_ID> {
    boolean existsBySngNoAndSeq(String sngNo, BigDecimal seq);

}