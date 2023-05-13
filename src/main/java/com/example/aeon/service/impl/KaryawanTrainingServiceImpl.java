package com.example.aeon.service.impl;

import com.example.aeon.entity.KaryawanTrainingEntity;
import com.example.aeon.repository.KaryawanTrainingEntityRepository;
import com.example.aeon.service.KaryawanTrainingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KaryawanTrainingServiceImpl implements KaryawanTrainingService {

    private final KaryawanTrainingEntityRepository karyawanTrainingEntityRepository;

    public KaryawanTrainingServiceImpl(KaryawanTrainingEntityRepository karyawanTrainingEntityRepository) {
        this.karyawanTrainingEntityRepository = karyawanTrainingEntityRepository;
    }

    @Override
    public List<KaryawanTrainingEntity> findAllKaryawanTraining() {
        return karyawanTrainingEntityRepository.findAll();
    }

    @Override
    public Optional<KaryawanTrainingEntity> findById(Long id) {
        return karyawanTrainingEntityRepository.findById(id);
    }

    @Override
    public KaryawanTrainingEntity saveKaryawanTraining(KaryawanTrainingEntity karyawanTrainingEntity) {
        return karyawanTrainingEntityRepository.save(karyawanTrainingEntity);
    }

    @Override
    public KaryawanTrainingEntity updateKaryawanTraining(KaryawanTrainingEntity karyawanTrainingEntity) {
        return karyawanTrainingEntityRepository.save(karyawanTrainingEntity);
    }

    @Override
    public void deleteKaryawanTraining(Long id) {
        karyawanTrainingEntityRepository.deleteById(id);
    }
}

