package nhbank.core.repositories;

import nhbank.core.domain.AFTR_FFH_COMM_TRSC_PTCLInfo;
import nhbank.core.domain.AFTR_FFH_COMM_TRSC_PTCLInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFTR_FFH_COMM_TRSC_PTCLInfoRepository extends JpaRepository<AFTR_FFH_COMM_TRSC_PTCLInfo, AFTR_FFH_COMM_TRSC_PTCLInfo_ID> {
    boolean existsByTrscBrNoAndTrscDtAndCommTrscSeqNoAndCommTrscDtlsSeqNo(String trscBrNo, Date trscDt, BigDecimal commTrscSeqNo, BigDecimal commTrscDtlsSeqNo);

}