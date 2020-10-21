package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_DTG_CONT_STSInfo; 
import nhbank.core.domain.ACOM_DTG_CONT_STSInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_DTG_CONT_STSInfoRepository extends JpaRepository<ACOM_DTG_CONT_STSInfo, ACOM_DTG_CONT_STSInfo_ID> { 
	boolean existsByRefNoAndSeqNoAndBrNo(String refNo, BigDecimal seqNo, String brNo);
}