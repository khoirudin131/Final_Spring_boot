package com.example.aeon.controller;

import com.example.aeon.dto.request.KaryawanRequest;
import com.example.aeon.dto.response.KaryawanResponse;
import com.example.aeon.entity.KaryawanEntity;
import com.example.aeon.repository.KaryawanEntityRepository;
import com.example.aeon.service.KaryawanService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/karyawan")
public class KaryawanController {

    private final KaryawanService karyawanService;

    public KaryawanController(KaryawanService karyawanService) {
        this.karyawanService = karyawanService;
    }

    @GetMapping
    public List<KaryawanEntity> findAll(){
        return karyawanService.findAllKaryawan();
    }

    @Autowired
    KaryawanEntityRepository kRepo;

    @GetMapping("/getByName/name")
    public ResponseEntity<List<KaryawanEntity>>getKaryawanByName (@RequestParam String name){
        return new ResponseEntity<List<KaryawanEntity>>(kRepo.findByName(name), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<KaryawanEntity> findKaryawanById(@PathVariable("id") Long id){
        return karyawanService.findById(id);
    }

    @PostMapping
    public KaryawanEntity saveKaryawan(@RequestBody KaryawanEntity karyawanEntity){
        return karyawanService.saveKaryawan(karyawanEntity);
    }

    @PutMapping
    public KaryawanEntity updateKaryawan(@RequestBody KaryawanEntity karyawanEntity){
        return karyawanService.updateKaryawan(karyawanEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteKaryawan(@PathVariable("id") Long id){
        karyawanService.deleteKaryawan(id);
    }


//    //    Using Request and Response with save and update karyawan
//
//    @PostMapping("/res")
//    public KaryawanResponse saveKarResponse(@RequestBody KaryawanRequest karyawanRequest) {
//        return karyawanService.saveKaryawan(karyawanRequest);
//    }
//
//    @PutMapping("/res/{id}")
//    public KaryawanResponse updateKarResponse(@RequestBody KaryawanRequest karyawanRequest, @PathVariable("id") Long id) {
//        return karyawanService.updateKaryawan(karyawanRequest, id);
//    }

    @GetMapping("/res")
    public List<KaryawanEntity> getKarResponse(){
        return karyawanService.findAllKaryawan();
    }

    @GetMapping("/res/{id}")
    public Optional<KaryawanEntity> getKarResponse(@RequestBody KaryawanRequest karyawanRequest, @PathVariable("id") Long id){
        return karyawanService.findById(id);
    }

    @GetMapping("/get/{id}")
    Optional<KaryawanEntity> getKaryawanEntity(@PathVariable Long id){
        return karyawanService.findById(id);
    }


}
