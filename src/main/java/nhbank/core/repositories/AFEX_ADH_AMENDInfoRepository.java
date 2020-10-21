package nhbank.core.repositories; 
import nhbank.core.domain.AFEX_ADH_AMENDInfo; 
import nhbank.core.domain.AFEX_ADH_AMENDInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface AFEX_ADH_AMENDInfoRepository extends JpaRepository<AFEX_ADH_AMENDInfo, AFEX_ADH_AMENDInfo_ID> { 
	boolean existsByMakeIlAndSeqNo(Date makeIl, BigDecimal seqNo);
}