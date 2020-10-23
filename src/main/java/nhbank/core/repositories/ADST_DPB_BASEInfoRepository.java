package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_BASEInfo;
import nhbank.core.domain.ADST_DPB_BASEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ADST_DPB_BASEInfoRepository extends JpaRepository<ADST_DPB_BASEInfo, ADST_DPB_BASEInfo_ID> {
    boolean existsByAcctNo(String acctNo);

}