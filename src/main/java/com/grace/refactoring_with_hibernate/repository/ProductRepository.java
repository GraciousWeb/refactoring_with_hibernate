package com.grace.refactoring_with_hibernate.repository;


import com.grace.refactoring_with_hibernate.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

