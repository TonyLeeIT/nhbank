package nhbank.core.repositories;

import nhbank.core.domain.AFEX_XPH_RENEGOInfo;
import nhbank.core.domain.AFEX_XPH_RENEGOInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_XPH_RENEGOInfoRepository extends JpaRepository<AFEX_XPH_RENEGOInfo, AFEX_XPH_RENEGOInfo_ID> {
    boolean existsByRefNo(String refNo);

}