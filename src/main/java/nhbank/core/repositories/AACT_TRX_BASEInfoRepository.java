package nhbank.core.repositories; 
import nhbank.core.domain.AACT_TRX_BASEInfo; 
import nhbank.core.domain.AACT_TRX_BASEInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AACT_TRX_BASEInfoRepository extends JpaRepository<AACT_TRX_BASEInfo, AACT_TRX_BASEInfo_ID> { 
	boolean existsByTrxIlAndTrxBr(Date trxIl, String trxBr);
}