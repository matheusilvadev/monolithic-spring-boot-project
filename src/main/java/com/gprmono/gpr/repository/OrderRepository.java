package com.gprmono.gpr.repository;

import com.gprmono.gpr.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
