package nhbank.core.repositories;

import nhbank.core.domain.AFEX_BFH_BASEInfo;
import nhbank.core.domain.AFEX_BFH_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface AFEX_BFH_BASEInfoRepository extends JpaRepository<AFEX_BFH_BASEInfo, AFEX_BFH_BASEInfo_ID> {
    boolean existsByRecvIlAndSeqNo(Date recvIl, BigDecimal seqNo);

}