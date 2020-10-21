package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_COM_ALLOWInfo; 
import nhbank.core.domain.ACOM_COM_ALLOWInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_COM_ALLOWInfoRepository extends JpaRepository<ACOM_COM_ALLOWInfo, ACOM_COM_ALLOWInfo_ID> { 
	boolean existsByRefNo(String refNo);
}