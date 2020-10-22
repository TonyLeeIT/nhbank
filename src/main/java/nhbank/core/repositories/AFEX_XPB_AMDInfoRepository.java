package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_AMDInfo;
import nhbank.core.domain.AFEX_XPB_AMDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPB_AMDInfoRepository extends JpaRepository<AFEX_XPB_AMDInfo, AFEX_XPB_AMDInfo_ID> {
    boolean existsByRefNoAndSeqNo(String refNo, BigDecimal seqNo);

}