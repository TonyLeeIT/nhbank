package nhbank.core.repositories;


import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ACOM_LMT_BASEHISInfoRepo extends JpaRepository<ACOM_LMT_BASEHISInfo, String> {
    boolean existsBySngNo(String sngNo);
}
