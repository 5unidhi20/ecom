package com.capstone.ecom.services.customer.cart;

import com.capstone.ecom.dto.AddProductInCartDto;
import com.capstone.ecom.entity.CartItems;
import com.capstone.ecom.entity.Order;
import com.capstone.ecom.enums.OrderStatus;
import com.capstone.ecom.repository.CartItemRepository;
import com.capstone.ecom.repository.OrderRepository;
import com.capstone.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto){
        Order activeOrder = orderRepository.findByUserIdAndStatus(addProductInCartDto.getUserId(), OrderStatus.Pending);
        Optional<CartItems> optionalCartItems = cartItemsRepository.findByProductIdAndOrderIdAndUserId
                (addProductInCartDto.getProductId(), activeOrder.getId(), addProductInCartDto.getUserId());
    }
}
