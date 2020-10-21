package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_IPH_BASEInfo; 
import nhbank.core.domain.AFEX_IPH_BASEInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_IPH_BASEInfoRepository extends JpaRepository<AFEX_IPH_BASEInfo, AFEX_IPH_BASEInfo_ID> { 
	boolean existsByRefNo(String refNo);
}