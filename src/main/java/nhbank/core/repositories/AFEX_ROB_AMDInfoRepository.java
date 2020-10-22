package nhbank.core.repositories;

import nhbank.core.domain.AFEX_ROB_AMDInfo;
import nhbank.core.domain.AFEX_ROB_AMDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_ROB_AMDInfoRepository extends JpaRepository<AFEX_ROB_AMDInfo, AFEX_ROB_AMDInfo_ID> {
    boolean existsByRefNoAndChgSeqAndTblGb(String refNo, BigDecimal chgSeq, String tblGb);

}