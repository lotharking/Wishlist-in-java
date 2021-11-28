package com.test.sprongboot.catalogo.repository;

import java.util.List;

import com.test.sprongboot.catalogo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
