package com.example.aeon.controller;

import com.example.aeon.entity.KaryawanTrainingEntity;
import com.example.aeon.service.KaryawanTrainingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/karyawantraining")

public class KaryawanTrainingController {

    private final KaryawanTrainingService karyawanTrainingService;

    public KaryawanTrainingController(KaryawanTrainingService karyawanTrainingService) {
        this.karyawanTrainingService = karyawanTrainingService;
    }

    @GetMapping
    public List<KaryawanTrainingEntity> findAll(){
        return karyawanTrainingService.findAllKaryawanTraining();
    }

    @GetMapping("/{id}")
    public Optional<KaryawanTrainingEntity> findKaryawanTrainingById(@PathVariable("id") Long id){
        return karyawanTrainingService.findById(id);
    }

    @PostMapping
    public KaryawanTrainingEntity saveKaryawanTraining(@RequestBody KaryawanTrainingEntity karyawanTrainingEntity){
        return karyawanTrainingService.saveKaryawanTraining(karyawanTrainingEntity);
    }

    @PutMapping
    public KaryawanTrainingEntity updateTraining(@RequestBody KaryawanTrainingEntity karyawanTrainingEntity){
        return karyawanTrainingService.updateKaryawanTraining(karyawanTrainingEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteTraining(@PathVariable("id") Long id){
        karyawanTrainingService.deleteKaryawanTraining(id);
    }
}
