package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_CERTInfo;
import nhbank.core.domain.ADST_DPB_CERTInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ADST_DPB_CERTInfoRepository extends JpaRepository<ADST_DPB_CERTInfo, ADST_DPB_CERTInfo_ID> {
    boolean existsByAcctNoAndIbIl(String acctNo, Date ibIl);

}