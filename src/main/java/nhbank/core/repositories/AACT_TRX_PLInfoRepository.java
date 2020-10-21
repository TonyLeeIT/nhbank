package nhbank.core.repositories; 
import nhbank.core.domain.AACT_TRX_PLInfo; 
import nhbank.core.domain.AACT_TRX_PLInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AACT_TRX_PLInfoRepository extends JpaRepository<AACT_TRX_PLInfo, AACT_TRX_PLInfo_ID> { 
	boolean existsByRefNoAndHisNoAndSegSeq(String refNo, BigDecimal hisNo, BigDecimal segSeq);
}