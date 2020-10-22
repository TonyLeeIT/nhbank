package nhbank.core.repositories;

import nhbank.core.domain.ACOM_DMH_ALLOCHISInfo;
import nhbank.core.domain.ACOM_DMH_ALLOCHISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_DMH_ALLOCHISInfoRepository extends JpaRepository<ACOM_DMH_ALLOCHISInfo, ACOM_DMH_ALLOCHISInfo_ID> {
    boolean existsByDamboNoAndCixNoAndSngNoAndSeqNoAndHisNo(String damboNo, String cixNo, String sngNo, BigDecimal seqNo, BigDecimal hisNo);

}