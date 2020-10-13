package nhbank.core.services.impl;

import nhbank.core.domain.HT002Info;
import nhbank.core.repositories.TableRepo;
import nhbank.core.services.BackupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackupServiceImpl implements BackupService {
    public static final Logger logger = LoggerFactory.getLogger(BackupServiceImpl.class);

    @Autowired
    TableRepo tableRepo;

    @Override
    public void updateTable(HT002Info ht002Info) {

    }

    @Override
    public void insertTable(HT002Info ht002Info) {

    }

    @Override
    public boolean isExistTable(HT002Info rv001Info) {
        return false;
    }
}
