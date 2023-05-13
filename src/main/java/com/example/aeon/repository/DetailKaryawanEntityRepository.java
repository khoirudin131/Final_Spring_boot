package com.example.aeon.repository;

import com.example.aeon.entity.DetailKaryawanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailKaryawanEntityRepository extends JpaRepository<DetailKaryawanEntity, Long> {
    Optional<DetailKaryawanEntity> findById(Long id);
}
