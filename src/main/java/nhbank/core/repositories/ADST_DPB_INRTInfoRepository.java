package nhbank.core.repositories;

import nhbank.core.domain.ADST_DPB_INRTInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ADST_DPB_INRTInfoRepository extends JpaRepository<ADST_DPB_INRTInfo, UUID> {

}