package nhbank.core.repositories;


import nhbank.core.domain.HT002Info;

public interface TableRepo {
    void insertTable(HT002Info ht002Info);

    void updateTable(HT002Info ht002Info);

    boolean isExistData(HT002Info ht002Info);
}
