package nhbank.core.repositories;

import nhbank.core.domain.ACOM_COM_FEERTInfo;
import nhbank.core.domain.ACOM_COM_FEERTInfo_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ACOM_COM_FEERTInfoRepository extends JpaRepository<ACOM_COM_FEERTInfo, ACOM_COM_FEERTInfo_ID> {
    boolean existsByLcdAndMcdAndScdAndMngBrAndApplyIl(String lcd, String mcd, String scd, String mngBr, Date applyIl);

}