package com.example.aeon.service;

import com.example.aeon.dto.request.DetailKaryawanRequest;
import com.example.aeon.entity.DetailKaryawanEntity;

import java.util.List;
import java.util.Optional;

public interface DetailKaryawanService {

    List<DetailKaryawanEntity> findAllDetailKaryawan();
    Optional<DetailKaryawanEntity> findById(Long id);
    DetailKaryawanEntity saveDetailKaryawan(DetailKaryawanEntity detailKaryawanEntity);
    DetailKaryawanEntity updateDetailKaryawan(DetailKaryawanEntity detailKaryawanEntity);
    void deleteDetailKaryawan(Long id);

    //

    DetailKaryawanRequest saveDetail(DetailKaryawanRequest request);
    DetailKaryawanRequest updateDetail(DetailKaryawanRequest request);
}
