package nhbank.core.repositories;

import nhbank.core.domain.ACOM_EPB_RPTInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ACOM_EPB_RPTInfoRepository extends JpaRepository<ACOM_EPB_RPTInfo, UUID> {

}