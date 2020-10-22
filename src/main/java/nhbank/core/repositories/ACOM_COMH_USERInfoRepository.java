package nhbank.core.repositories;

import nhbank.core.domain.ACOM_COMH_USERInfo;
import nhbank.core.domain.ACOM_COMH_USERInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_COMH_USERInfoRepository extends JpaRepository<ACOM_COMH_USERInfo, ACOM_COMH_USERInfo_ID> {
    boolean existsByOpNo(String opNo);

}