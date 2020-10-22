package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RCH_SEQNOInfo;
import nhbank.core.domain.AFEX_RCH_SEQNOInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AFEX_RCH_SEQNOInfoRepository extends JpaRepository<AFEX_RCH_SEQNOInfo, AFEX_RCH_SEQNOInfo_ID> {
    boolean existsByTrIlAndSaGbAndCdAndCcy(Date trIl, String saGb, String cd, String ccy);

}