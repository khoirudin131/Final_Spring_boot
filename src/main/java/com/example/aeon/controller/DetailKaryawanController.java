package com.example.aeon.controller;

import com.example.aeon.dto.request.DetailKaryawanRequest;
import com.example.aeon.entity.DetailKaryawanEntity;

import com.example.aeon.entity.KaryawanEntity;
import com.example.aeon.service.DetailKaryawanService;


import com.example.aeon.service.KaryawanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detail")
@AllArgsConstructor
public class DetailKaryawanController {

    private final DetailKaryawanService detailKaryawanService;
    private final KaryawanService karyawanService;
    
    @GetMapping
    public List<DetailKaryawanEntity> findAll(){
        return detailKaryawanService.findAllDetailKaryawan();
    }


    @GetMapping("/{id}")
    public Optional<DetailKaryawanEntity> findDetailKaryawanById(@PathVariable("id") Long id){
        return detailKaryawanService.findById(id);
    }

    @PostMapping
    public DetailKaryawanEntity saveDetailKaryawan(@RequestBody DetailKaryawanEntity detailKaryawanEntity){
        return detailKaryawanService.saveDetailKaryawan(detailKaryawanEntity);
    }

    @PutMapping
    public DetailKaryawanEntity updateDetailKaryawan(@RequestBody DetailKaryawanEntity detailKaryawanEntity){
        return detailKaryawanService.updateDetailKaryawan(detailKaryawanEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteDetailKaryawan(@PathVariable("id") Long id){
        detailKaryawanService.deleteDetailKaryawan(id);
    }

    //
    @PostMapping("/save")
    public DetailKaryawanRequest saveDetail(@RequestBody DetailKaryawanRequest request){
        return detailKaryawanService.saveDetail(request);
    }

}
