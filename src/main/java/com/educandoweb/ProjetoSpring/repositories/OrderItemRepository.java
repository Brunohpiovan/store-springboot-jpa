package com.educandoweb.ProjetoSpring.repositories;

import com.educandoweb.ProjetoSpring.entities.OrderItem;
import com.educandoweb.ProjetoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
