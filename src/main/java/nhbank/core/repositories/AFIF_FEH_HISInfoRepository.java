package nhbank.core.repositories;

import nhbank.core.domain.AFIF_FEH_HISInfo;
import nhbank.core.domain.AFIF_FEH_HISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFIF_FEH_HISInfoRepository extends JpaRepository<AFIF_FEH_HISInfo, AFIF_FEH_HISInfo_ID> {
    boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);

}