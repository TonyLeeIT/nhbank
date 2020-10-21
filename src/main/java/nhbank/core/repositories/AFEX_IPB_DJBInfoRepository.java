package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_IPB_DJBInfo; 
import nhbank.core.domain.AFEX_IPB_DJBInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_IPB_DJBInfoRepository extends JpaRepository<AFEX_IPB_DJBInfo, AFEX_IPB_DJBInfo_ID> { 
	boolean existsByRefNoAndSeq(String refNo, BigDecimal seq);
}