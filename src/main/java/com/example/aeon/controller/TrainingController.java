package com.example.aeon.controller;

import com.example.aeon.entity.TrainingEntity;
import com.example.aeon.service.TrainingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/training")
public class TrainingController {

        private final TrainingService trainingService;

        public TrainingController(TrainingService trainingService) {
            this.trainingService = trainingService;
        }

        @GetMapping
        public List<TrainingEntity> findAll(){
            return trainingService.findAllTraining();
        }

        @GetMapping("/{id}")
        public Optional<TrainingEntity> findTrainingById(@PathVariable("id") Long id){
            return trainingService.findById(id);
        }

        @PostMapping
        public TrainingEntity saveTraining(@RequestBody TrainingEntity trainingEntity){
            return trainingService.saveTraining(trainingEntity);
        }

        @PutMapping
        public TrainingEntity updateTraining(@RequestBody TrainingEntity trainingEntity){
            return trainingService.updateTraining(trainingEntity);
        }

        @DeleteMapping("/{id}")
        public void deleteTraining(@PathVariable("id") Long id){
            trainingService.deleteTraining(id);
        }
}
