package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_COM_CCYInfo; 
import nhbank.core.domain.ACOM_COM_CCYInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_COM_CCYInfoRepository extends JpaRepository<ACOM_COM_CCYInfo, ACOM_COM_CCYInfo_ID> { 
	boolean existsByCd(String cd);
}