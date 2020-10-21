package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_XPH_COVERInfo; 
import nhbank.core.domain.AFEX_XPH_COVERInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_XPH_COVERInfoRepository extends JpaRepository<AFEX_XPH_COVERInfo, AFEX_XPH_COVERInfo_ID> { 
	boolean existsByRefNo(String refNo);
}