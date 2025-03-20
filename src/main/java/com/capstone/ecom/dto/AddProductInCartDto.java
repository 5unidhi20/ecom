package com.capstone.ecom.dto;

import lombok.Data;

@Data
public class AddProductInCartDto {

    private long userId;

    private Long productId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
