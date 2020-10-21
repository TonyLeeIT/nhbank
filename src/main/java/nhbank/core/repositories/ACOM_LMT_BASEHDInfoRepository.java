package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_LMT_BASEHDInfo; 
import nhbank.core.domain.ACOM_LMT_BASEHDInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_LMT_BASEHDInfoRepository extends JpaRepository<ACOM_LMT_BASEHDInfo, ACOM_LMT_BASEHDInfo_ID> { 
	boolean existsBySngNo(String sngNo);
}