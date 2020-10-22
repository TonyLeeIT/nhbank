package nhbank.core.repositories;

import nhbank.core.domain.ACOM_LMT_SILHISInfo;
import nhbank.core.domain.ACOM_LMT_SILHISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_LMT_SILHISInfoRepository extends JpaRepository<ACOM_LMT_SILHISInfo, ACOM_LMT_SILHISInfo_ID> {
    boolean existsBySngNoAndActCdAndSilCcyAndHisNo(String sngNo, String actCd, String silCcy, BigDecimal hisNo);

}