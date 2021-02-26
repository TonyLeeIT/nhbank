package nhbank.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nhbank.core.domain.CheckUpdateDetail;

@Repository
public interface CheckUpdateDetailRepository extends JpaRepository<CheckUpdateDetail, Long> {

}
