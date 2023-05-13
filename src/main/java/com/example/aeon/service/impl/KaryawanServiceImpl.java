package com.example.aeon.service.impl;

import com.example.aeon.dto.mapper.KaryawanMapper;
import com.example.aeon.dto.request.KaryawanRequest;
import com.example.aeon.dto.response.KaryawanResponse;
import com.example.aeon.entity.KaryawanEntity;
import com.example.aeon.repository.DetailKaryawanEntityRepository;
import com.example.aeon.repository.KaryawanEntityRepository;
import com.example.aeon.service.DetailKaryawanService;
import com.example.aeon.service.KaryawanService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class KaryawanServiceImpl implements KaryawanService {

    private final KaryawanEntityRepository karyawanEntityRepository;
    private final DetailKaryawanEntityRepository detailKaryawanEntityRepository;

    @Override
    public List<KaryawanEntity> findAllKaryawan() {
        return karyawanEntityRepository.findAll();
    }


    @Override
    public Optional<KaryawanEntity> findById(Long id) {
        return karyawanEntityRepository.findById(id);
    }

    @Override
    public KaryawanEntity saveKaryawan(KaryawanEntity karyawanEntity) {
        return karyawanEntityRepository.save(karyawanEntity);
    }

    @Override
    public KaryawanEntity updateKaryawan(KaryawanEntity karyawanEntity) {
        return karyawanEntityRepository.save(karyawanEntity);
    }

    @Override
    public void deleteKaryawan(Long id) {

        karyawanEntityRepository.deleteById(id);
    }
}
