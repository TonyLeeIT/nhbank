package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_HEJIInfo;
import nhbank.core.domain.ADST_DPB_HEJIInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ADST_DPB_HEJIInfoRepository extends JpaRepository<ADST_DPB_HEJIInfo, ADST_DPB_HEJIInfo_ID> {
    boolean existsByAcctNoAndIbIlAndTrxNo(String acctNo, Date ibIl, BigDecimal trxNo);

}