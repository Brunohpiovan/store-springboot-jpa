package com.educandoweb.ProjetoSpring.repositories;

import com.educandoweb.ProjetoSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
