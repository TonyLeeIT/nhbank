package nhbank.core.repositories; 
import nhbank.core.domain.ADST_LNB_SCHInfo; 
import nhbank.core.domain.ADST_LNB_SCHInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_LNB_SCHInfoRepository extends JpaRepository<ADST_LNB_SCHInfo, ADST_LNB_SCHInfo_ID> { 
	boolean existsByRefNoAndSchGbAndAdjSeqAndSchSeq(String refNo, String schGb, BigDecimal adjSeq, BigDecimal schSeq);
}