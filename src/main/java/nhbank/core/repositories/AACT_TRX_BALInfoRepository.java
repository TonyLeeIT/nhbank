package nhbank.core.repositories;

import nhbank.core.domain.AACT_TRX_BALInfo;
import nhbank.core.domain.AACT_TRX_BALInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AACT_TRX_BALInfoRepository extends JpaRepository<AACT_TRX_BALInfo, AACT_TRX_BALInfo_ID> {
    boolean existsByRefNoAndBalDvCdAndDtlsBalDvCdAndIfrsDvCdAndAtitCdAndCcyAndApclStrDtAndApclEndDt(String refNo, String balDvCd, String dtlsBalDvCd, String ifrsDvCd, String atitCd, String ccy, Date apclStrDt, Date apclEndDt);

}