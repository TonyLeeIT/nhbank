package nhbank.core.repositories;

import nhbank.core.domain.ACOM_DMH_HISInfo;
import nhbank.core.domain.ACOM_DMH_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_DMH_HISInfoRepository extends JpaRepository<ACOM_DMH_HISInfo, ACOM_DMH_HISInfo_ID> {
    boolean existsByCixNoAndDamboNoAndHisNoAndSts(String cixNo, String damboNo, BigDecimal hisNo, String sts);

}