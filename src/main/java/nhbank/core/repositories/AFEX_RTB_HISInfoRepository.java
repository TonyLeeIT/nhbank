package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_RTB_HISInfo; 
import nhbank.core.domain.AFEX_RTB_HISInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_RTB_HISInfoRepository extends JpaRepository<AFEX_RTB_HISInfo, AFEX_RTB_HISInfo_ID> { 
	boolean existsByRefNoAndHisNo(String refNo, BigDecimal hisNo);
}