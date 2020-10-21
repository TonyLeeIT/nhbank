package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_COMH_MSGInfo; 
import nhbank.core.domain.ACOM_COMH_MSGInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_COMH_MSGInfoRepository extends JpaRepository<ACOM_COMH_MSGInfo, ACOM_COMH_MSGInfo_ID> { 
	boolean existsByDocId(String docId);
}