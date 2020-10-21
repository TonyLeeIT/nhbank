package nhbank.core.repositories; 
import nhbank.core.domain.ADST_DPB_HISInfo; 
import nhbank.core.domain.ADST_DPB_HISInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_DPB_HISInfoRepository extends JpaRepository<ADST_DPB_HISInfo, ADST_DPB_HISInfo_ID> { 
	boolean existsByAcctNoAndHisNo(String acctNo, BigDecimal hisNo);
}