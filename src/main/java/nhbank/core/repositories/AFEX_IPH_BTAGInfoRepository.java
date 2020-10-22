package nhbank.core.repositories;

import nhbank.core.domain.AFEX_IPH_BTAGInfo;
import nhbank.core.domain.AFEX_IPH_BTAGInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface AFEX_IPH_BTAGInfoRepository extends JpaRepository<AFEX_IPH_BTAGInfo, AFEX_IPH_BTAGInfo_ID> {
    boolean existsByRefNoAndTagCdAndSeq(String refNo, String tagCd, BigDecimal seq);

}