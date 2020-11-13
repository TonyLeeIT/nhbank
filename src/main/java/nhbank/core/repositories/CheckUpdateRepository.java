package nhbank.core.repositories;

import nhbank.core.domain.CheckUpdate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CheckUpdateRepository extends JpaRepository<CheckUpdate, Long> {
    Page<CheckUpdate> findAllByTableNameContaining(String tableName, Pageable pageable);
}
