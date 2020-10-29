package nhbank.core.services;

import nhbank.core.domain.Demo;

import java.util.List;
import java.util.Optional;


public interface DemoService {
    List<Demo> findAll();
    Optional<Demo> findById(Long id);
    void save(Demo demo);
    void delete(Long id);
}
