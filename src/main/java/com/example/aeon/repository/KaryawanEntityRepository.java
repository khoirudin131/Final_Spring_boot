package com.example.aeon.repository;

import com.example.aeon.entity.KaryawanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface KaryawanEntityRepository extends JpaRepository<KaryawanEntity, Long> {

List<KaryawanEntity> findByName(String name);

    Optional<KaryawanEntity> findById(Long id);
}
