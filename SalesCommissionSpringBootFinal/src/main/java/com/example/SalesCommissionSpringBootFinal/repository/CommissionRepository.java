package com.example.SalesCommissionSpringBootFinal.repository;

import com.example.SalesCommissionSpringBootFinal.Model.Commission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommissionRepository extends JpaRepository<Commission, Long> {
    List<Commission> findByCreatedDateIs(String date);
}
