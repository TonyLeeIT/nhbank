package nhbank.core.repositories.impl;

import nhbank.core.domain.HT002Info;
import nhbank.core.repositories.TableRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class TableRepoImpl implements TableRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertTable(HT002Info ht002Info) {

    }

    @Override
    public void updateTable(HT002Info ht002Info) {

    }

    @Override
    public boolean isExistData(HT002Info ht002Info) {
        return false;
    }
}
