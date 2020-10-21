package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_ADH_HISInfo; 
import nhbank.core.domain.AFEX_ADH_HISInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_ADH_HISInfoRepository extends JpaRepository<AFEX_ADH_HISInfo, AFEX_ADH_HISInfo_ID> { 
	boolean existsByAdvNoAndHisNo(String advNo, BigDecimal hisNo);
}