package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_DROKInfo;
import nhbank.core.domain.ADST_DPB_DROKInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ADST_DPB_DROKInfoRepository extends JpaRepository<ADST_DPB_DROKInfo, ADST_DPB_DROKInfo_ID> {
    boolean existsByAcctNoAndIbIlAndDrTrxNo(String acctNo, Date ibIl, BigDecimal drTrxNo);

}