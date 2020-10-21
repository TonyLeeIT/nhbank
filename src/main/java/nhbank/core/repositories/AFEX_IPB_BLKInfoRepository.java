package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_IPB_BLKInfo; 
import nhbank.core.domain.AFEX_IPB_BLKInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_IPB_BLKInfoRepository extends JpaRepository<AFEX_IPB_BLKInfo, AFEX_IPB_BLKInfo_ID> { 
	boolean existsByRefNoAndSeq(Sseq(String refNo, BigDecimal seq);BigDecimal sseq);
}