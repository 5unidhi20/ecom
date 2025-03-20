package com.capstone.ecom.repository;

import com.capstone.ecom.entity.Order;
import com.capstone.ecom.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByUserIdAndOrderStatus(long userId, OrderStatus orderStatus);
}
