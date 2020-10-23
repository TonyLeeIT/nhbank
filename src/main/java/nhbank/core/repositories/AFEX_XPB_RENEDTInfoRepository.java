package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPB_RENEDTInfo;
import nhbank.core.domain.AFEX_XPB_RENEDTInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AFEX_XPB_RENEDTInfoRepository extends JpaRepository<AFEX_XPB_RENEDTInfo, AFEX_XPB_RENEDTInfo_ID> {
    boolean existsByMngIlAndRefNo(Date mngIl, String refNo);

}