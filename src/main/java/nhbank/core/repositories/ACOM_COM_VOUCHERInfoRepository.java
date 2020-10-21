package nhbank.core.repositories; 
import nhbank.core.domain.ACOM_COM_VOUCHERInfo; 
import nhbank.core.domain.ACOM_COM_VOUCHERInfo_ID; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.math.BigDecimal; 
import java.util.Date; 
import java.util.List;
@Repository
public interface ACOM_COM_VOUCHERInfoRepository extends JpaRepository<ACOM_COM_VOUCHERInfo, ACOM_COM_VOUCHERInfo_ID> { 
	boolean existsByAcIlAndAcBr(String acIl, String acBr);
}