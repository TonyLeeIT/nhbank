package nhbank.core.repositories;

import nhbank.core.domain.ACOM_DTG_NAPAS_RECONInfo;
import nhbank.core.domain.ACOM_DTG_NAPAS_RECONInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACOM_DTG_NAPAS_RECONInfoRepository extends JpaRepository<ACOM_DTG_NAPAS_RECONInfo, ACOM_DTG_NAPAS_RECONInfo_ID> {
    boolean existsByBkCdAndTrnDateAndReconTypeAndDe032AcqCdAndDe041CrdAcptTrmAndDe011TraceNo(String bkCd, String trnDate, String reconType, String de032AcqCd, String de041CrdAcptTrm, String de011TraceNo);

}