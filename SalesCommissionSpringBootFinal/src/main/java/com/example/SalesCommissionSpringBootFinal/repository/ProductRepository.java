package com.example.SalesCommissionSpringBootFinal.repository;

import com.example.SalesCommissionSpringBootFinal.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
