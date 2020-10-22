package nhbank.core.repositories;

import nhbank.core.domain.ACOM_FAB_HISInfo;
import nhbank.core.domain.ACOM_FAB_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_FAB_HISInfoRepository extends JpaRepository<ACOM_FAB_HISInfo, ACOM_FAB_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}