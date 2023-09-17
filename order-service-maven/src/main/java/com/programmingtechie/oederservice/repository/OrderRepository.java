package com.programmingtechie.oederservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmingtechie.oederservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
