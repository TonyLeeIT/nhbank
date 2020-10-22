package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_GYULInfo;
import nhbank.core.domain.ADST_DPB_GYULInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ADST_DPB_GYULInfoRepository extends JpaRepository<ADST_DPB_GYULInfo, ADST_DPB_GYULInfo_ID> {
    boolean existsByIbIlAndYedeAndAcctNo(Date ibIl, String yede, String acctNo);

}