package nhbank.core.services;

import nhbank.core.domain.CheckUpdate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface CheckUpdateService {
    Page<CheckUpdate> findAll(Pageable pageable);

    Page<CheckUpdate> findAllByTableName(String tableName, Pageable pageable);

    Optional<CheckUpdate> findById(Long id);

    void save(CheckUpdate demo);

    void delete(Long id);
}
