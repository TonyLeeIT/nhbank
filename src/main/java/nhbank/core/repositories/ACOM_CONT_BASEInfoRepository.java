package nhbank.core.repositories;

import nhbank.core.domain.ACOM_CONT_BASEInfo;
import nhbank.core.domain.ACOM_CONT_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_CONT_BASEInfoRepository extends JpaRepository<ACOM_CONT_BASEInfo, ACOM_CONT_BASEInfo_ID> {
    boolean existsByRefNoAndCntyCdAndRgnCd(String refNo, String cntyCd, String rgnCd);

}