package nhbank.core.services;


public interface BackupService<T> {

    void updateTable(Iterable<T> t);

    void insertTable(T t);

    boolean isExistTable(T t);
}
