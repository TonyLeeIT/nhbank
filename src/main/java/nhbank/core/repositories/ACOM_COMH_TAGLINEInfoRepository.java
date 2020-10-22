package nhbank.core.repositories;

import nhbank.core.domain.ACOM_COMH_TAGLINEInfo;
import nhbank.core.domain.ACOM_COMH_TAGLINEInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ACOM_COMH_TAGLINEInfoRepository extends JpaRepository<ACOM_COMH_TAGLINEInfo, ACOM_COMH_TAGLINEInfo_ID> {
    boolean existsByDocIdAndSeqNo(String docId, BigDecimal seqNo);

}