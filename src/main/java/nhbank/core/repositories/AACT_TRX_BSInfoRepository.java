package nhbank.core.repositories;

import nhbank.core.domain.AACT_TRX_BSInfo;
import nhbank.core.domain.AACT_TRX_BSInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AACT_TRX_BSInfoRepository extends JpaRepository<AACT_TRX_BSInfo, AACT_TRX_BSInfo_ID> {
    boolean existsByRefNoAndHisNoAndSegSeq(String refNo, BigDecimal hisNo, BigDecimal segSeq);

}