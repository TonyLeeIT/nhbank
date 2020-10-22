package nhbank.core.repositories;

import nhbank.core.domain.ACOM_COM_ACTCDInfo;
import nhbank.core.domain.ACOM_COM_ACTCDInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_COM_ACTCDInfoRepository extends JpaRepository<ACOM_COM_ACTCDInfo, ACOM_COM_ACTCDInfo_ID> {
    boolean existsByBrNoAndBsplGbAndAcCd(String brNo, String bsplGb, String acCd);

}