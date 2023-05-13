package com.example.aeon.service.impl;

import com.example.aeon.dto.request.DetailKaryawanRequest;
import com.example.aeon.entity.DetailKaryawanEntity;
import com.example.aeon.repository.DetailKaryawanEntityRepository;
import com.example.aeon.repository.KaryawanEntityRepository;
import com.example.aeon.service.DetailKaryawanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DetailKaryawanServiceImpl implements DetailKaryawanService {

    private final DetailKaryawanEntityRepository detailKaryawanEntityRepository;
    private final KaryawanEntityRepository karyawanEntityRepository;

    @Override
    public List<DetailKaryawanEntity> findAllDetailKaryawan() {
        return detailKaryawanEntityRepository.findAll();
    }

    @Override
    public Optional<DetailKaryawanEntity> findById(Long id) {
        return detailKaryawanEntityRepository.findById(id);
    }

    @Override
    public DetailKaryawanEntity saveDetailKaryawan(DetailKaryawanEntity detailKaryawanEntity) {
        return detailKaryawanEntityRepository.save(detailKaryawanEntity);
    }

    @Override
    public DetailKaryawanEntity updateDetailKaryawan(DetailKaryawanEntity detailKaryawanEntity) {
        return detailKaryawanEntityRepository.save(detailKaryawanEntity);
    }

    @Override
    public void deleteDetailKaryawan(Long id) {
        detailKaryawanEntityRepository.deleteById(id);
    }


    //

    @Override
    public DetailKaryawanRequest saveDetail(DetailKaryawanRequest request) {
        DetailKaryawanEntity detail = new DetailKaryawanEntity();
        detail.setKaryawanentity(karyawanEntityRepository.getById(request.getKaryawanentity()));
        DetailKaryawanEntity detail2 = detailKaryawanEntityRepository.save(detail);
        System.out.println(detail2);

        return request;
    }

    @Override
    public DetailKaryawanRequest updateDetail(DetailKaryawanRequest request) {
        return null;
    }

}
