package com.example.SalesCommissionSpringBootFinal.repository;

import com.example.SalesCommissionSpringBootFinal.Model.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
}
