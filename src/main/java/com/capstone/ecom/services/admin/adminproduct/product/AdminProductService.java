package com.capstone.ecom.services.admin.adminproduct.product;

import com.capstone.ecom.dto.ProductDto;

import java.util.List;

public interface AdminProductService {
    ProductDto addProduct(ProductDto productDto) throws Exception;

    List<ProductDto> getAllProducts();

    Boolean deleteProduct(Long id);
}

