package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_INTMInfo;
import nhbank.core.domain.ADST_DPB_INTMInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface ADST_DPB_INTMInfoRepository extends JpaRepository<ADST_DPB_INTMInfo, ADST_DPB_INTMInfo_ID> {
    boolean existsByAcctNoAndIbIlAndGisIlAndIntSeq(String acctNo, Date ibIl, Date gisIl, BigDecimal intSeq);

}