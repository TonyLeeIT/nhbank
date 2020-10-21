package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_CIX_LOCALInfo; 
import nhbank.core.domain.ACOM_CIX_LOCALInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_CIX_LOCALInfoRepository extends JpaRepository<ACOM_CIX_LOCALInfo, ACOM_CIX_LOCALInfo_ID> { 
	boolean existsByCixNoAndItemNm(String cixNo, String itemNm);
}