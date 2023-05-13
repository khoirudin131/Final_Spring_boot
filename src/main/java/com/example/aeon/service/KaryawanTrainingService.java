package com.example.aeon.service;

import com.example.aeon.entity.KaryawanTrainingEntity;

import java.util.List;
import java.util.Optional;

public interface KaryawanTrainingService {

    List<KaryawanTrainingEntity> findAllKaryawanTraining();
    Optional<KaryawanTrainingEntity> findById(Long id);
    KaryawanTrainingEntity saveKaryawanTraining(KaryawanTrainingEntity karyawanTrainingEntity);
    KaryawanTrainingEntity updateKaryawanTraining(KaryawanTrainingEntity karyawanTrainingEntity);
    void deleteKaryawanTraining(Long id);
}
