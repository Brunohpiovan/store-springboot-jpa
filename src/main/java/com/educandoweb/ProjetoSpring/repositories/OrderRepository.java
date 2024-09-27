package com.educandoweb.ProjetoSpring.repositories;

import com.educandoweb.ProjetoSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
