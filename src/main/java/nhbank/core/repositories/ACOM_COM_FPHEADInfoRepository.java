package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_COM_FPHEADInfo; 
import nhbank.core.domain.ACOM_COM_FPHEADInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_COM_FPHEADInfoRepository extends JpaRepository<ACOM_COM_FPHEADInfo, ACOM_COM_FPHEADInfo_ID> { 
	boolean existsByRefNoAndHisNoAndPrtKind(String refNo, BigDecimal hisNo, String prtKind);
}