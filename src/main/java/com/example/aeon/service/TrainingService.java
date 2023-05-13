package com.example.aeon.service;

import com.example.aeon.entity.TrainingEntity;

import java.util.List;
import java.util.Optional;

public interface TrainingService {

        List<TrainingEntity> findAllTraining();
        Optional<TrainingEntity> findById(Long id);
        TrainingEntity saveTraining(TrainingEntity trainingEntity);
        TrainingEntity updateTraining(TrainingEntity trainingEntity);
        void deleteTraining(Long id);
}
