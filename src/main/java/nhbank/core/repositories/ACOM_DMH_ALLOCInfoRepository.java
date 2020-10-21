package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_DMH_ALLOCInfo; 
import nhbank.core.domain.ACOM_DMH_ALLOCInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_DMH_ALLOCInfoRepository extends JpaRepository<ACOM_DMH_ALLOCInfo, ACOM_DMH_ALLOCInfo_ID> { 
	boolean existsByDamboNoAndCixNoAndSngNoAndSeqNo(String damboNo, String cixNo, String sngNo, BigDecimal seqNo);
}