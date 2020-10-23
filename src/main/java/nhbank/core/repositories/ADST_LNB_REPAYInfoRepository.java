package nhbank.core.repositories;

import nhbank.core.domain.ADST_LNB_REPAYInfo;
import nhbank.core.domain.ADST_LNB_REPAYInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ADST_LNB_REPAYInfoRepository extends JpaRepository<ADST_LNB_REPAYInfo, ADST_LNB_REPAYInfo_ID> {
    boolean existsByRefNoAndHisNoAndSeqNo(String refNo, BigDecimal hisNo, BigDecimal seqNo);

}