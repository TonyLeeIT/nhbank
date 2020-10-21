package nhbank.core.repositories; 
import nhbank.core.domain.ADST_DPB_BURIInfo; 
import nhbank.core.domain.ADST_DPB_BURIInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_DPB_BURIInfoRepository extends JpaRepository<ADST_DPB_BURIInfo, ADST_DPB_BURIInfo_ID> { 
	boolean existsByAcctNoAndBuriIl(String acctNo, Date buriIl);
}