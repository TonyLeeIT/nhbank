package nhbank.core.services;


import nhbank.core.domain.HT002Info;

public interface BackupService {
    void updateTable(HT002Info ht002Info);

    void insertTable(HT002Info ht002Info);

    boolean isExistTable(HT002Info rv001Info);
}
