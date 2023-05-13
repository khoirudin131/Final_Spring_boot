package com.example.aeon.service;

import com.example.aeon.dto.request.KaryawanRequest;
import com.example.aeon.dto.response.KaryawanResponse;
import com.example.aeon.entity.KaryawanEntity;

import java.util.List;
import java.util.Optional;

public interface KaryawanService {
    List<KaryawanEntity> findAllKaryawan();
    Optional<KaryawanEntity> findById(Long id);
    KaryawanEntity saveKaryawan(KaryawanEntity karyawanEntity);
    KaryawanEntity updateKaryawan(KaryawanEntity karyawanEntity);
    void deleteKaryawan(Long id);

}
