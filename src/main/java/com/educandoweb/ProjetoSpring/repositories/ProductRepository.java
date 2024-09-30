package com.educandoweb.ProjetoSpring.repositories;

import com.educandoweb.ProjetoSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
