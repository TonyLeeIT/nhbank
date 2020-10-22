package nhbank.core.repositories;

import nhbank.core.domain.AFEX_ADH_BASEInfo;
import nhbank.core.domain.AFEX_ADH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_ADH_BASEInfoRepository extends JpaRepository<AFEX_ADH_BASEInfo, AFEX_ADH_BASEInfo_ID> {
    boolean existsByMakeIlAndSeqNo(Date makeIl, BigDecimal seqNo);

}