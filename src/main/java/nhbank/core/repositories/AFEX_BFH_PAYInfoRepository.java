package nhbank.core.repositories;

import nhbank.core.domain.AFEX_BFH_PAYInfo;
import nhbank.core.domain.AFEX_BFH_PAYInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_BFH_PAYInfoRepository extends JpaRepository<AFEX_BFH_PAYInfo, AFEX_BFH_PAYInfo_ID> {
    boolean existsByRefNoAndPayCnt(String refNo, BigDecimal payCnt);

}