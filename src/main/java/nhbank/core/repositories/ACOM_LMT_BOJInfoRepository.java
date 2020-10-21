package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_LMT_BOJInfo; 
import nhbank.core.domain.ACOM_LMT_BOJInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_LMT_BOJInfoRepository extends JpaRepository<ACOM_LMT_BOJInfo, ACOM_LMT_BOJInfo_ID> { 
	boolean existsBySngNoAndSeq(String sngNo, BigDecimal seq);
}