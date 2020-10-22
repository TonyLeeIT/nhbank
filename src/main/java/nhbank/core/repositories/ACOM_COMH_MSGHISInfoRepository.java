package nhbank.core.repositories;

import nhbank.core.domain.ACOM_COMH_MSGHISInfo;
import nhbank.core.domain.ACOM_COMH_MSGHISInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_COMH_MSGHISInfoRepository extends JpaRepository<ACOM_COMH_MSGHISInfo, ACOM_COMH_MSGHISInfo_ID> {
    boolean existsByDocIdAndSeqNo(String docId, BigDecimal seqNo);

}