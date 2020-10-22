package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPH_ATAGInfo;
import nhbank.core.domain.AFEX_IPH_ATAGInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface AFEX_IPH_ATAGInfoRepository extends JpaRepository<AFEX_IPH_ATAGInfo, AFEX_IPH_ATAGInfo_ID> {
    boolean existsByRefNoAndAmdSeqAndTagCdAndSeq(String refNo, String amdSeq, String tagCd, BigDecimal seq);

}