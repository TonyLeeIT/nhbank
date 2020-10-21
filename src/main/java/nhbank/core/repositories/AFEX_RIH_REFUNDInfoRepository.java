package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_RIH_REFUNDInfo; 
import nhbank.core.domain.AFEX_RIH_REFUNDInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_RIH_REFUNDInfoRepository extends JpaRepository<AFEX_RIH_REFUNDInfo, AFEX_RIH_REFUNDInfo_ID> { 
	boolean existsByRefNoAndSeqNo(String refNo, BigDecimal seqNo);
}