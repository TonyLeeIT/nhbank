package nhbank.core.repositories;

import nhbank.core.domain.ADST_LNB_AGRInfo;
import nhbank.core.domain.ADST_LNB_AGRInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ADST_LNB_AGRInfoRepository extends JpaRepository<ADST_LNB_AGRInfo, ADST_LNB_AGRInfo_ID> {
    boolean existsByRefNo(String refNo);

}