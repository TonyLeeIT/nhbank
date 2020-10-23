package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPH_SHIPInfo;
import nhbank.core.domain.AFEX_XPH_SHIPInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_XPH_SHIPInfoRepository extends JpaRepository<AFEX_XPH_SHIPInfo, AFEX_XPH_SHIPInfo_ID> {
    boolean existsByRefNoAndSeq(String refNo, BigDecimal seq);

}