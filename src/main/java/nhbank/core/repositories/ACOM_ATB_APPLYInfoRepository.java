package nhbank.core.repositories;

import nhbank.core.domain.ACOM_ATB_APPLYInfo;
import nhbank.core.domain.ACOM_ATB_APPLYInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_ATB_APPLYInfoRepository extends JpaRepository<ACOM_ATB_APPLYInfo, ACOM_ATB_APPLYInfo_ID> {
    boolean existsByApplyNo(String applyNo);

}