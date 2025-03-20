package com.capstone.ecom.controller.customer;

import com.capstone.ecom.dto.AddProductInCartDto;
import com.capstone.ecom.services.customer.cart.CartService;
import lombok.RequiredArgsConstructor;
import com.capstone.ecom.dto.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/cart")
    public ResponseEntity<?> addProductToCart(@RequestBody AddProductInCartDto addProductInCartDto){
        return cartService.addProductToCart(addProductInCartDto);
    }

//    @GetMapping("/cart/{userId}")
//    public ResponseEntity<?> getCartByUserId(@PathVariable Long userId){
//        OrderDto orderDto = cartService.getCartByUserId(userId);
//        return ResponseEntity.status(HttpStatus.OK).body(orderDto);
//    }
}

