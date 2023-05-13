package com.example.aeon.repository;

import com.example.aeon.entity.KaryawanTrainingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanTrainingEntityRepository extends JpaRepository<KaryawanTrainingEntity, Long> {
}
