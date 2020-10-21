package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_RCH_PENDInfo; 
import nhbank.core.domain.AFEX_RCH_PENDInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_RCH_PENDInfoRepository extends JpaRepository<AFEX_RCH_PENDInfo, AFEX_RCH_PENDInfo_ID> { 
	boolean existsByCdAndCcyAndSaGbAndTrIlAndTrSeqAndValIl(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date valIl);
}