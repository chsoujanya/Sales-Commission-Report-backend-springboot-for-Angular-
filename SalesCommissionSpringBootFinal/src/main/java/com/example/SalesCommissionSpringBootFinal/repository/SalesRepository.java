package com.example.SalesCommissionSpringBootFinal.repository;

import com.example.SalesCommissionSpringBootFinal.Model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales,Long> {
}
