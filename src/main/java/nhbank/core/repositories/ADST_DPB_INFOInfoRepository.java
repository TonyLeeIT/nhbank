package nhbank.core.repositories; 
import nhbank.core.domain.ADST_DPB_INFOInfo; 
import nhbank.core.domain.ADST_DPB_INFOInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_DPB_INFOInfoRepository extends JpaRepository<ADST_DPB_INFOInfo, ADST_DPB_INFOInfo_ID> { 
	boolean existsByAcctNo(String acctNo);
}