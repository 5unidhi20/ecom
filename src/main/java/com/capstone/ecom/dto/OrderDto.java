package com.capstone.ecom.dto;

import com.capstone.ecom.entity.CartItems;
import com.capstone.ecom.entity.User;
import com.capstone.ecom.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;
import com.capstone.ecom.dto.CartItemDto;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class OrderDto {

    private Long id;

    private String orderDescription;

    private Date date;

    private String address;

    private String payment;

    private Long amount;

    private OrderStatus orderStatus;

    private Long totalAmount;

    private Long discount;

    private UUID trackingId;

    private String userName;


    private List<CartItemDto> cartItems;
}
