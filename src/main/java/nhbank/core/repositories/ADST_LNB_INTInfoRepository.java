package nhbank.core.repositories;

import nhbank.core.domain.ADST_LNB_INTInfo;
import nhbank.core.domain.ADST_LNB_INTInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ADST_LNB_INTInfoRepository extends JpaRepository<ADST_LNB_INTInfo, ADST_LNB_INTInfo_ID> {
    boolean existsByRefNoAndHisNoAndSeqNo(String refNo, BigDecimal hisNo, BigDecimal seqNo);

}