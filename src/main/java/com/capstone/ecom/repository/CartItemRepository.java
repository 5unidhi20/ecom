package com.capstone.ecom.repository;

import com.capstone.ecom.entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItems,Long> {


    Optional<CartItems> findByProductIdAndOrderIdAndUserId(Long productId, Long id, Long userId);

}
