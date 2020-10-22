package nhbank.core.repositories;

import nhbank.core.domain.AFEX_RTB_HSSInfo;
import nhbank.core.domain.AFEX_RTB_HSSInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AFEX_RTB_HSSInfoRepository extends JpaRepository<AFEX_RTB_HSSInfo, AFEX_RTB_HSSInfo_ID> {
    boolean existsByRefNo(String refNo);

}