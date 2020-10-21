package nhbank.core.repositories; 
import nhbank.core.domain.ADST_DPB_BASEInfo; 
import nhbank.core.domain.ADST_DPB_BASEInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_DPB_BASEInfoRepository extends JpaRepository<ADST_DPB_BASEInfo, ADST_DPB_BASEInfo_ID> { 
	boolean existsByAcctNo(String acctNo);
}