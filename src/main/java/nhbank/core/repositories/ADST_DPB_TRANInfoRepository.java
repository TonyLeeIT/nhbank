package nhbank.core.repositories; 
import nhbank.core.domain.ADST_DPB_TRANInfo; 
import nhbank.core.domain.ADST_DPB_TRANInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ADST_DPB_TRANInfoRepository extends JpaRepository<ADST_DPB_TRANInfo, ADST_DPB_TRANInfo_ID> { 
	boolean existsByAcctNoAndIbIlAndTrxNo(String acctNo, Date ibIl, BigDecimal trxNo);
}