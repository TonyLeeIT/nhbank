package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_COM_FPBODYInfo; 
import nhbank.core.domain.ACOM_COM_FPBODYInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_COM_FPBODYInfoRepository extends JpaRepository<ACOM_COM_FPBODYInfo, ACOM_COM_FPBODYInfo_ID> { 
	boolean existsByRefNoAndHisNoAndPrtKindAndLineSeq(String refNo, BigDecimal hisNo, String prtKind, BigDecimal lineSeq);
}