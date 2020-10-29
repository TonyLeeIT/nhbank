package nhbank.core.services.impl;

import nhbank.core.domain.Demo;
import nhbank.core.repositories.DemoRepository;
import nhbank.core.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoRepository demoRepository;
    @Override
    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

    @Override
    public Optional<Demo> findById(Long id) {
        return demoRepository.findById(id);
    }

    @Override
    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    @Override
    public void delete(Long id) {
        demoRepository.deleteById(id);
    }
}
