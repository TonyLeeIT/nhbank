package nhbank.core.repositories;

import nhbank.core.domain.ACOM_LMT_BASEACTInfo;
import nhbank.core.domain.ACOM_LMT_BASEACTInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_LMT_BASEACTInfoRepository extends JpaRepository<ACOM_LMT_BASEACTInfo, ACOM_LMT_BASEACTInfo_ID> {
    boolean existsBySngNoAndActCd(String sngNo, String actCd);

}