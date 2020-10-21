package nhbank.core.repositories; 
import nhbank.core.domain.ADST_DPB_YEDEInfo; 
import nhbank.core.domain.ADST_DPB_YEDEInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_DPB_YEDEInfoRepository extends JpaRepository<ADST_DPB_YEDEInfo, ADST_DPB_YEDEInfo_ID> { 
	boolean existsByAcctNoAndModeGb(String acctNo, String modeGb);
}