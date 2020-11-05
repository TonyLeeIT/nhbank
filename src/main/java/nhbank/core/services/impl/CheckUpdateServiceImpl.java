package nhbank.core.services.impl;

import nhbank.core.domain.CheckUpdate;

import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.CheckUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


@Service
public class CheckUpdateServiceImpl implements CheckUpdateService {
    @Autowired
    CheckUpdateRepository checkUpdateRepository;

    @Override
    public Page<CheckUpdate> findAll(Pageable pageable) {
        return checkUpdateRepository.findAll(pageable);
    }

    @Override
    public Optional<CheckUpdate> findById(Long id) {
        return checkUpdateRepository.findById(id);
    }

    @Override
    public void save(CheckUpdate demo) {
        checkUpdateRepository.save(demo);
    }

    @Override
    public void delete(Long id) {
        checkUpdateRepository.deleteById(id);
    }
}
