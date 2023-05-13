package com.example.aeon.service.impl;

import com.example.aeon.entity.TrainingEntity;
import com.example.aeon.repository.TrainingEntityRepository;
import com.example.aeon.service.TrainingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TrainingServiceImpl implements TrainingService{

    private final TrainingEntityRepository trainingEntityRepository;

    public TrainingServiceImpl(TrainingEntityRepository trainingEntityRepository) {
        this.trainingEntityRepository = trainingEntityRepository;
    }

    @Override
    public List<TrainingEntity> findAllTraining() {
        return trainingEntityRepository.findAll();
    }

    @Override
    public Optional<TrainingEntity> findById(Long id) {
        return trainingEntityRepository.findById(id);
    }

    @Override
    public TrainingEntity saveTraining(TrainingEntity trainingEntity) {
        return trainingEntityRepository.save(trainingEntity);
    }

    @Override
    public TrainingEntity updateTraining(TrainingEntity trainingEntity) {
        return trainingEntityRepository.save(trainingEntity);
    }

    @Override
    public void deleteTraining(Long id) {
        trainingEntityRepository.deleteById(id);
    }
}

