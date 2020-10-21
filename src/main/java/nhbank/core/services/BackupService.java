package nhbank.core.services;


import java.util.List;

public interface BackupService<T> {

    void updateAll(List<T> listObj);

    void insert(T obj);

    boolean isExist(T obj);
}
