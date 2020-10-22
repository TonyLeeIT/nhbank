package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_INRTInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface ADST_DPB_INRTInfoRepository extends JpaRepository<ADST_DPB_INRTInfo, UUID> {

}