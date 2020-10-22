package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPH_SHIP_RESENDInfo;
import nhbank.core.domain.AFEX_XPH_SHIP_RESENDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_XPH_SHIP_RESENDInfoRepository extends JpaRepository<AFEX_XPH_SHIP_RESENDInfo, AFEX_XPH_SHIP_RESENDInfo_ID> {
    boolean existsByRefNoAndBhSeqAndSeq(String refNo, BigDecimal bhSeq, BigDecimal seq);

}