package nhbank.core.repositories;

import nhbank.core.domain.ACOM_DTG_NAPAS_HISInfo;
import nhbank.core.domain.ACOM_DTG_NAPAS_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_DTG_NAPAS_HISInfoRepository extends JpaRepository<ACOM_DTG_NAPAS_HISInfo, ACOM_DTG_NAPAS_HISInfo_ID> {
    boolean existsByTrnDateAndDe032AcqCdAndDe041CrdAcptTrmAndDe011TraceNoAndHisNo(String trnDate, String de032AcqCd, String de041CrdAcptTrm, String de011TraceNo, BigDecimal hisNo);

}