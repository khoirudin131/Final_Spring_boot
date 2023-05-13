package com.example.aeon.repository;

import com.example.aeon.entity.RekeningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RekeningEntityRepository extends JpaRepository<RekeningEntity, Long> {
}
