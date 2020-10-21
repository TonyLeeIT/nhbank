package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_IPH_HISInfo; 
import nhbank.core.domain.AFEX_IPH_HISInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_IPH_HISInfoRepository extends JpaRepository<AFEX_IPH_HISInfo, AFEX_IPH_HISInfo_ID> { 
	boolean existsByRefNoAndSeqNo(String refNo, BigDecimal seqNo);
}