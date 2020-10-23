package nhbank.core.repositories;

import nhbank.core.domain.ACOM_EPB_HISInfo;
import nhbank.core.domain.ACOM_EPB_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ACOM_EPB_HISInfoRepository extends JpaRepository<ACOM_EPB_HISInfo, ACOM_EPB_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}