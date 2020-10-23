package nhbank.core.repositories;

import nhbank.core.domain.AFIF_MTH_HISInfo;
import nhbank.core.domain.AFIF_MTH_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFIF_MTH_HISInfoRepository extends JpaRepository<AFIF_MTH_HISInfo, AFIF_MTH_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}